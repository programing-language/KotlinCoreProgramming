package exploration.functionalProgramming.implementTypeclass

/**
 * Created by ChenJinXin on 2021/7/21 下午2:51
 */
interface Show<F> {
    fun F.show(): String
}

class Book(val name: String)

object BookShow : Show<Book> {
    override fun Book.show(): String = this.name
}

fun main() {
    BookShow.run {
        println(Book("Dive Into Kotlin").show())
    }
}