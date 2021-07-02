package core.lambdaAndCollection.inlineFunction

/**
 * Created by ChenJinXin on 2021/7/2 上午9:49
 */
fun main() {
    foo2({
        println("I am inlined...")
    }, {
        println("I am not inlined")
    }
    )
}

inline fun foo2(block1: () -> Unit, noinline block2: () -> Unit) {
    println("before block")
    block1()
    block2()
    println("end block")
}