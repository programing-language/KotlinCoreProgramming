package exploration.designPatterns.behavioral.chainOfResponsibilityModel


/**
 * Created by ChenJinXin on 2021/7/9 上午10:32
 */

class PartialFunction<in P1, out R>(private val definetAt: (P1) -> Boolean, private val f: (P1) -> R) : (P1) -> R {
    override fun invoke(p1: P1): R {
        if (definetAt(p1)) {
            return f(p1)
        } else {
            throw IllegalArgumentException("Value:($p1) isn't supported by this function")
        }
    }

    fun isDefinedAt(p1: P1) = definetAt(p1)
}

infix fun <P1, R> PartialFunction<P1, R>.orElse(that: PartialFunction<P1, R>): PartialFunction<P1, R> {
    return PartialFunction({ this.isDefinedAt(it) || that.isDefinedAt(it) }) {
        when {
            this.isDefinedAt(it) -> this(it)
            else -> that(it)
        }
    }
}

val groupLeader = {
    val definetAt: (ApplyEvent) -> Boolean = { it.money <= 200 }
    val handler: (ApplyEvent) -> Unit = { println("Group Leader handled application: ${it.title}") }
    PartialFunction(definetAt, handler)
}()

val president = {
    val definetAt: (ApplyEvent) -> Boolean = { it.money <= 500 }
    val handler: (ApplyEvent) -> Unit = { println("President handled application: ${it.title}") }
    PartialFunction(definetAt, handler)
}()

val college = {
    val definetAt: (ApplyEvent) -> Boolean = { true }
    val handler: (ApplyEvent) -> Unit = {
        when {
            it.money > 1000 -> println("College: This application is refused.")
            else -> println("College handled application: ${it.title}")
        }
    }
    PartialFunction(definetAt, handler)
}()

fun main() {
    val applyChain = groupLeader orElse president orElse college
    applyChain(ApplyEvent(10,"bug a pen"))
    applyChain(ApplyEvent(200,"team building"))
    applyChain(ApplyEvent(399,"team building too"))
    applyChain(ApplyEvent(600,"hold a debate match"))
    applyChain(ApplyEvent(1200,"annual meeting of the college"))
}