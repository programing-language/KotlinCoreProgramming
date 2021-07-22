package actual.combat.developingResponsiveWebApplications.usingCompletableFutureToRealizeAsynchronousNonBlocking

import java.util.concurrent.CompletableFuture
import java.util.stream.Collectors
import java.util.stream.Stream

/**
 * Created by ChenJinXin on 2021/7/22 下午12:19
 */
data class Goods(val id: Long, val name: String, val stock: Int)
data class Address(val userId: Long, val location: String)

fun getGoodsFromDB(goodsId: Long): CompletableFuture<Goods> {
    //返回的是CompletableFuture<Goods>
    return CompletableFuture.supplyAsync {
        Thread.sleep(1000) //模拟IO操作
        Goods(goodsId, "深入Kotlin", 10)
    }
}

fun getAddressFromDB(userId: Long): CompletableFuture<Address> {
    //返回的是CompletableFuture<Address>
    return CompletableFuture.supplyAsync {
        Thread.sleep(1000) //模拟IO操作
        Address(userId, "杭州")
    }
}

fun doOrder(goods: Goods, address: Address): CompletableFuture<Long> {
    return CompletableFuture.supplyAsync {
        Thread.sleep(1000) //模拟IO操作
        1L
    }
}

fun main(args: Array<String>) {
    val goodsF = getGoodsFromDB(1)
    val addressF = getAddressFromDB(1)
    CompletableFuture.allOf(goodsF, addressF).thenApply { //保证前两个IO操作返回结果后再执行
        Stream.of(goodsF, addressF).map { it.join() }.collect(Collectors.toList<Any>()) //这里需要借助Stream来获取结果
    }.thenApply {
        doOrder(it[0] as Goods, it[1] as Address)
    }.join()
}