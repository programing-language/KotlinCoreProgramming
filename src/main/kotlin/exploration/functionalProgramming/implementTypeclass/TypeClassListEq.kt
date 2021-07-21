package exploration.functionalProgramming.implementTypeclass

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader

/**
 * Created by ChenJinXin on 2021/7/21 下午2:41
 */
abstract class ListEq<A>(val a: Eq<A>) : Eq<Kind<List.K, A>> {
    override fun Kind<List.K, A>.eq(that: Kind<List.K, A>): Boolean {
        val curr = this
        return if (curr is Cons && that is Cons) {
            val headEq = a.run {
                curr.head.eq(that.head)
            }
            if (headEq) curr.tail.eq(that.tail) else false
        } else curr is Nil && that is Nil
    }
}

object IntListEq : ListEq<Int>(IntEq)

fun main() {
    IntListEq.run {
        val a = Cons(1, Cons(2, Nil))
        val b = Cons(1, Cons(2, Nil))
        val c = Cons(1, Nil)
        println(a.eq(b))
        println(a.eq(c))
    }
}