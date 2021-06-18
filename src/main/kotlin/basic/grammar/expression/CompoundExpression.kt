package basic.grammar.expression

/**
 * Created by chenjinxin on 2021/6/17 上午10:37
 */
val a: Int? = null
// ?: 类似Scala中的getOrElse方法
val res: Int? = a ?: 1
fun main() {
    println(res)
}