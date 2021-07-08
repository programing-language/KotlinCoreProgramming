package exploration.designPatterns.behavioral.observerMode

import java.util.*

/**
 * Created by ChenJinXin on 2021/7/8 下午4:03
 */
class StockUpdate : Observable() {
    val observers = mutableSetOf<Observer>()

    fun setStockChanged(price: Int) {
        this.observers.forEach { it.update(this, price) }
    }
}

class StockDisplay : Observer {
    override fun update(o: Observable?, arg: Any?) {
        if (o is StockUpdate) {
            println("The latest stock price is $arg")
        }
    }
}

fun main() {
    val su = StockUpdate()
    val sd = StockDisplay()
    su.observers.add(sd)
    su.setStockChanged(100)
}