package kotlinBasic.basic.grammar.demo4Lambda

/**
 * Created by chenjinxin on 2021/6/15 下午4:55
 */
fun main() {

    val foo = { x: Int ->
        val y = x + 1
        y
    }
    println(foo(1))// 2

    fun p(x: Int) = {
        print(x)
    }
    listOf(1, 2, 3).forEach { p(it) }// 什么都不输出

    fun p1(x: Int) {
        print(x)
    }
    listOf(1, 2, 3).forEach { p1(it) }// 123

    println()
    fun p2(x: Int) = run {
        print(x)
    }
    listOf(1, 2, 3).forEach { p2(it) }// 123

    println()
    fun p3(x: Int) = {
        print(x)
    }
    listOf(1, 2, 3).forEach { p3(it).invoke() }// 123

    println()
    fun p4(x: Int) = {
        print(x)
    }
    listOf(1, 2, 3).forEach { p4(it)() }// 123
}