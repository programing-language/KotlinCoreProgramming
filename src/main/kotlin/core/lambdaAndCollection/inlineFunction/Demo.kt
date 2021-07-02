package core.lambdaAndCollection.inlineFunction

/**
 * Created by ChenJinXin on 2021/7/2 上午9:43
 */
fun main() {
    foo {
        println("dive into Kotlin")
    }
}

inline fun foo(block: () -> Unit) {
    println("before block")
    block()
    println("end block")
}