package basic.grammar.demo4Lambda

/**
 * Created by chenjinxin on 2021/6/15 下午4:50
 */
fun main() {
    val sum: (Int, Int) -> Int = { x: Int, y: Int -> x + y }
    val sum1 = { x: Int, y: Int -> x + y }
    val sum2: (Int, Int) -> Int = { x, y -> x + y }

    println(sum(1, 2))
    println(sum1(1, 2))
    println(sum2(1, 2))
}