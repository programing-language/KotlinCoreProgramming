package kotlinBasic.basic.grammar.demo5Kelihua

/**
 * Created by chenjinxin on 2021/6/17 上午10:13
 */
fun <A, B> Array<A>.corresponds(that: Array<B>, p: (A, B) -> Boolean): Boolean {
    val i = this.iterator()
    val j = that.iterator()
    while (i.hasNext() && j.hasNext()) {
        if (!p(i.next(), j.next())) {
            return false
        }
    }
    return !i.hasNext() && !j.hasNext()
}

fun main() {
    val a = arrayOf(1, 2, 3)
    val b = arrayOf(2, 3, 4)
    println(a.corresponds(b) { x, y -> x + 1 == y })
    println(a.corresponds(b) { x, y -> x + 2 == y })
}