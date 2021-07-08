package exploration.designPatterns.behavioral.iteratorMode

/**
 * Created by ChenJinXin on 2021/7/8 下午6:30
 */
data class Book2(val name: String)
class Bookcase2(private val books: List<Book2>) {
    operator fun iterator(): Iterator<Book2> = this.books.iterator()
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