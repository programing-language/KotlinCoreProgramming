package exploration.designPatterns.behavioral.iteratorMode

/**
 * Created by ChenJinXin on 2021/7/8 下午6:20
 */
data class Book(val name: String)
class Bookcase(private val books: List<Book>) : Iterator<Book> {
    private val iterator: Iterator<Book>

    init {
        this.iterator = books.iterator()
    }

    override fun hasNext(): Boolean = this.iterator.hasNext()

    override fun next(): Book = this.iterator.next()
}

fun main() {
    val bookcase = Bookcase(
            listOf(Book("Dive into Kotlin"), Book("Thinking in Java"))
    )

    while (bookcase.hasNext()) {
        println("The book name is ${bookcase.next().name}")
    }

    /*for (boot in bookcase) {
        println("The book name is ${boot.name}")
    }*/
}