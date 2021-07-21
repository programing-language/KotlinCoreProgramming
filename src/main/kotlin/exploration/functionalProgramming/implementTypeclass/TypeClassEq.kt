package exploration.functionalProgramming.implementTypeclass

/**
 * Created by ChenJinXin on 2021/7/21 下午2:41
 */
interface Eq<F> {
    fun F.eq(that: F): Boolean
}

object IntEq : Eq<Int> {
    override fun Int.eq(that: Int): Boolean {
        return this == that
    }
}

fun main() {
    IntEq.run {
        val a = 1
        println(a.eq(1))
        println(a.eq(2))
    }
}