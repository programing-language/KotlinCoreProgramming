package exploration.asynchronousAndConcurrent.cqrsArchitecture

/**
 * Created by ChenJinXin on 2021/7/21 下午6:32
 */
import akka.actor.ActorRef
import akka.actor.ActorSystem
import akka.actor.Props
import akka.actor.UntypedAbstractActor
import akka.pattern.Patterns
import akka.persistence.AbstractPersistentActor
import akka.util.Timeout
import scala.concurrent.Await
import scala.concurrent.duration.Duration
import java.util.*

class ShopStateActor(private val shopName: String, var stocks: HashMap<Long, Int>) : AbstractPersistentActor() {
    override fun persistenceId() = "ShopStateActor-${shopName}"
    var orderNumber = 1L

    override fun createReceiveRecover(): Receive = receiveBuilder().match(ShopEvt.ReduceStock::class.java, this::recoverReduceStock).build()

    private fun recoverReduceStock(evt: ShopEvt.ReduceStock) {
        val stock = stocks.getValue(evt.id)
        stocks.plus(Pair(evt.id, stock - evt.amount))
        orderNumber = evt.orderNumber
        orderNumber++
        //self.tell(viewData, viewActor) 视图数据发送给viewActor用于查询
    }

    private fun persistReduceStockAfter(evt: ShopEvt.ReduceStock) {
        val stock = stocks.getValue(evt.id)
        orderNumber++
        stocks.plus(Pair(evt.id, stock - evt.amount))
        sender.tell(orderNumber, self)
        //self.tell(viewData, viewActor) 视图数据发送给viewActor用于查询
    }

    private fun buyProcess(cmd: Action.Buy) {
        val stock = stocks.getValue(cmd.id)
        if (stock > cmd.amount) {
            persist(ShopEvt.ReduceStock(cmd.id, cmd.userId, cmd.amount, orderNumber), this::persistReduceStockAfter)
        } else {
            sender.tell("low stocks", self)
        }
    }

    override fun createReceive(): Receive = receiveBuilder().match(Action.Buy::class.java, this::buyProcess).build()

}

sealed class ShopEvt {
    object Snapshot : ShopEvt()
    data class SnapshotData(val orderNumber: Long, val stocks: Map<Long, Int>) : ShopEvt()
    data class ReduceStock(val id: Long, val userId: Long, val amount: Long, val orderNumber: Long) : ShopEvt()
    data class AddStock(val id: Long, val amount: Long) : ShopEvt()
}

sealed class Action {
    data class BuyOrInit(val id: Long, val userId: Long, val amount: Long, val shopName: String, val stocks: Map<Long, Int>) : Action()
    data class Buy(val id: Long, val userId: Long, val amount: Long) : Action()
    data class GetStock(val id: Long) : Action()
    data class GetStockOrInit(val id: Long, val shopName: String, val stocks: Map<Long, Int>) : Action()
}

class ManageStateActor : UntypedAbstractActor() {
    override fun onReceive(message: Any?) {
        when (message) {
            is Action.BuyOrInit -> {
                print(message)
                getOrInit(message.shopName, message.stocks).forward(Action.Buy(message.id, message.userId, message.amount), context)
            }
            is Action.GetStockOrInit -> getOrInit(message.shopName, message.stocks).forward(Action.GetStock(message.id), context)
        }
    }

    private fun getOrInit(shopName: String, stocks: Map<Long, Int>): ActorRef {
        return context.findChild("shop-actor-${shopName}").orElseGet { context.actorOf(Props.create(ShopStateActor::class.java, shopName, stocks), "shop-actor-${shopName}") }
    }

}

fun main(args: Array<String>) {
    val stocksB = hashMapOf(Pair(1L, 15), Pair(2L, 8), Pair(3L, 30))
    val actorSystem = ActorSystem.apply("shop-system") //
    val manageStateActor = actorSystem.actorOf(Props.create(ManageStateActor::class.java), "manage-state-actor")
    val timeout = Timeout(Duration.create(3, "seconds"))

    val resB = Patterns.ask(manageStateActor, Action.BuyOrInit(2L, 1L, 1, "B", stocksB), timeout)
    val orderNumber = Await.result(resB, timeout.duration())
    println("the orderNumber is $orderNumber")
}