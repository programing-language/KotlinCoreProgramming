package exploration.designPatterns.behavioral.iteratorMode

/**
 * Created by ChenJinXin on 2021/7/8 下午6:33
 */
class Bookcase3(val books: List<Book>) {}

operator fun Bookcase3.iterator(): Iterator<Book> = books.iterator()

fun main() {
    val bookcase = Bookcase3(
            listOf(Book("Dive into Kotlin"), Book("Thinking in Java"))
    )

    for (boot in bookcase) {
        println("The book name is ${boot.name}")
    }
}