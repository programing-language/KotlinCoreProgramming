package core.obj.oriented.staticToObject

/**
 * Created by chenjinxin on 2021/6/25 下午3:59
 */
class PrizeKotlin(val name: String, val count: Int, val type: Int) {
    companion object {
        val TYPE_REDPACK = 0
        val TYPE_COUPON = 1

        fun isRedpack(prize: PrizeKotlin): Boolean {
            return prize.type == TYPE_REDPACK
        }
    }
}

fun main(args: Array<String>) {
    val prize = PrizeKotlin("红包", 10, PrizeKotlin.TYPE_REDPACK)
    print(PrizeKotlin.isRedpack(prize))
}