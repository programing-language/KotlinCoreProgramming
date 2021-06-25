package core.obj.oriented.staticToObject.factoryModle

/**
 * Created by chenjinxin on 2021/6/25 下午4:04
 * 伴生对象是Kotlin中用来代替static关键字的一种方式，任何在Java类内部用static定义的内容都可以用Kotlin中的伴生对象来实现。
 */
class Prize private constructor(val name: String, val count: Int, val type: Int) {

    companion object {
        private const val TYPE_COMMON = 1
        private const val TYPE_RED_PACK = 2
        private const val TYPE_COUPON = 3
        private val defaultCommonPrize = Prize("普通奖品", 10, Prize.TYPE_COMMON)

        fun newRedPackPrize(name: String, count: Int) = Prize(name, count, Prize.TYPE_RED_PACK)
        fun newCouponPrize(name: String, count: Int) = Prize(name, count, Prize.TYPE_COUPON)
        fun defaultCommonPrize() = defaultCommonPrize
    }

    override fun toString(): String {
        return "Prize(name='$name', count=$count, type=$type)"
    }
}

fun main() {
    val redPackPrize = Prize.newRedPackPrize("红包",10)
    val couponPrize = Prize.newCouponPrize("十元代金券", 10)
    val commonPrize = Prize.defaultCommonPrize()

    println(redPackPrize.toString())
    println(couponPrize.toString())
    println(commonPrize.toString())
}