package kotlinBasic.basic.grammar.demo2

/**
 * Created by chenjinxin on 2021/6/11 下午3:16
 */
class Book(val name: String)

fun main(args: Array<String>) {
    val getBook = ::Book
    println(getBook("Kotlin").name)
}