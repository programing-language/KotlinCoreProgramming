package basic.grammar.stringDefOperator

/**
 * Created by chenjinxin on 2021/6/17 下午5:27
 */
fun main() {
    val a = "Java"
    val b = "Java"
    val c = "Kotlin"
    val d = "Kot"
    val e = "lin"
    val f = d + e
    println(a == b)
    println(a === b)
    println(c == f)
    println(c === f)
}