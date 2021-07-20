package exploration.functionalProgramming.implementTypeclass

/**
 * Created by ChenJinXin on 2021/7/20 下午6:15
 */
interface Kind<out F, out A>

interface Functor<F> {
    fun <A, B> Kind<F, A>.map(f: (A) -> B): Kind<F, B>
}

sealed class List<out A> : Kind<List.K, A> {
    object K
}

object Nil : List<Nothing>()

data class Cons<A>(val head: A, val tail: List<A>) : List<A>()

@Suppress("UNCHECKED_CAST", "NOTHING_TO_INLINE")
inline fun <A> Kind<List.K, A>.unwrap(): List<A> =
        this as List<A>

object ListFunctor : Functor<List.K> {
    override fun <A, B> Kind<List.K, A>.map(f: (A) -> B): Kind<List.K, B> {
        return when (this) {
            is Cons -> {
                val t = this.tail.map(f).unwrap()
                Cons<B>(f(this.head), t)
            }
            else -> Nil
        }
    }
}

fun main() {
    ListFunctor.run {
        val result = Cons(1, Nil).map { it + 1 }
        println(result)
    }
}