package core.polymorphismAndExtensions.extensions

/**
 * Created by ChenJinXin on 2021/7/5 下午5:56
 */

//成员方法优先级总高于扩展函数
class Son2 {
    fun foo() = println("son called member foo.")
}

fun Son2.foo() = println("son called extension foo.")

fun main() {
    Son2().foo()//son called member foo.
}