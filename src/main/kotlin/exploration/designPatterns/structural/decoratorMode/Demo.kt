package exploration.designPatterns.structural.decoratorMode

/**
 * Created by ChenJinXin on 2021/7/9 下午2:28
 */
interface MacBook {
    fun getCost(): Int
    fun getDest(): String
    fun getProdDate(): String
}

class MacBookPro : MacBook {
    override fun getCost() = 10000

    override fun getDest() = "MacBook Pro"

    override fun getProdDate() = "Late 2011"
}

// 装饰类
class ProcessorUpgradeMacBookPro(val macBook: MacBook) : MacBook by macBook {
    override fun getCost(): Int = macBook.getCost() + 219

    override fun getDest(): String = macBook.getDest() + ", +1G Memory"
}

fun main() {
    val macBookPro = MacBookPro()
    val processorUpgradeMacBookPro = ProcessorUpgradeMacBookPro(macBookPro)
    println(processorUpgradeMacBookPro.getCost())
    println(processorUpgradeMacBookPro.getDest())
}