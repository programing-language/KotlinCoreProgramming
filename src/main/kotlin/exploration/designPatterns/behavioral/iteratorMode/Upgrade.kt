package exploration.designPatterns.behavioral.iteratorMode

/**
 * Created by ChenJinXin on 2021/7/8 下午6:30
 */
class Bookcase2(val books: List<Book>) {
    operator fun iterator(): Iterator<Book> = this.books.iterator()
}

fun main() {
    val bookcase = Bookcase2(
            listOf(Book("Dive into Kotlin"), Book("Thinking in Java"))
    )

    for (boot in bookcase) {
        println("The book name is ${boot.name}")
    }
}