package exploration.functionalProgramming.implementTypeclass

/**
 * Created by ChenJinXin on 2021/7/21 下午2:54
 */
interface Foldable<F> {
    fun <A, B> Kind<F, A>.fold(init: B): ((B, A) -> B) -> B
}

object ListFoldable: Foldable<List.K> {
    override fun <A, B> Kind<List.K, A>.fold(init: B): ((B, A) -> B) -> B = { f ->
        fun fold0(l: List<A>, v: B): B {
            return when (l) {
                is Cons -> {
                    fold0(l.tail, f(v, l.head))
                }
                else -> v
            }
        }
        fold0(this.unwrap(), init)
    }
}

abstract class ListShow<A>(val a: Show<A>) : Show<Kind<List.K, A>> {
    override fun Kind<List.K, A>.show(): String {
        val fa = this
        return "[" + ListFoldable.run {
            fa.fold(listOf<String>())({ r, i ->
                r + a.run { i.show() }
            }).joinToString() + "]"
        }

    }
}

object BookListShow:ListShow<Book>(BookShow)

fun main() {
    BookListShow.run {
        println(
                Cons(
                        Book("Dive into Kotlin"),
                        Cons(Book("Thinking in Java"), Nil)
                ).show()
        )
    }
}
