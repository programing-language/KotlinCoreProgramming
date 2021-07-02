package core.lambdaAndCollection.inlineFunction

/**
 * Created by ChenJinXin on 2021/7/2 上午9:53
 */
fun test() {
    fun localReturn() {
        return
    }

    fun foo() {
        println("before local return")
        localReturn()
        println("after local return")
        return
    }

    foo()
}

fun test2() {
    fun foo(returning: () -> Unit) {
        println("before local return")
        returning()
        println("after local return")
        return
    }
    foo { return@foo }
}

inline fun foo2(returning: () -> Unit) {
    println("before local return")
    returning()
    println("after local return")
    return
}

fun hasZeros(list: List<Int>): Boolean {
    list.forEach {
        if (it == 0) {
            return true // 直接返回foo函数结果
        }
    }
    return false
}

fun main() {
//    test()
//    before local return
//    after local return

//    test2()
//    before local return
//    after local return

//    foo2 { return }
//    before local return

}