package exploration.designPatterns.behavioral.observerMode

import kotlin.properties.Delegates

/**
 * Created by ChenJinXin on 2021/7/8 下午4:12
 */
interface StockUpdateListener {
    fun onRise(price: Int)
    fun onFall(price: Int)
}

class StockDisplay2 : StockUpdateListener {
    override fun onRise(price: Int) {
        println("The latest stock price has risen to $price")
    }

    override fun onFall(price: Int) {
        println("The latest stock price has fall to $price")
    }
}

class StockUpdate2 {
    var listeners = mutableSetOf<StockUpdateListener>()

    var price: Int by Delegates.observable(0) { _, old, new ->
        listeners.forEach {
            if (new > old) it.onRise(price)
            else it.onFall(price)
        }
    }
}

fun main() {
    val su = StockUpdate2()
    val sd = StockDisplay2()
    su.listeners.add(sd)
    su.price = 100
    su.price = 98
}