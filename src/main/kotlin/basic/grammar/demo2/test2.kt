package basic.grammar.demo2

/**
 * Created by chenjinxin on 2021/6/11 下午3:19
 */
fun main(args: Array<String>) {
    val bookNames = listOf(
            Book("Java"),
            Book("Kotlin")
    ).map(Book::name)

    println(bookNames)
}