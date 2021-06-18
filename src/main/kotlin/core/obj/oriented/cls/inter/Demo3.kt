package core.obj.oriented.cls.inter

import kotlin.properties.Delegates

/**
 * Created by chenjinxin on 2021/6/18 下午3:14
 */
var test by Delegates.notNull<Int>()
fun doSomething() {
    test = 1
    println("test value is $test")
    test = 2
}

fun main() {
    doSomething()
    println(test)
}