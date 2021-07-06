package core.polymorphismAndExtensions.extensionsNotAPanacea

/**
 * Created by ChenJinXin on 2021/7/6 下午6:11
 */
open class Base2
class Extended2 : Base2()
open class X {
    open fun Base2.foo() {
        println("I'm Base2.foo in X")
    }

    open fun Extended2.foo() {
        println("I'm Extended2.foo in X")
    }

    fun deal(base: Base2) {
        base.foo()
    }
}

class Y : X() {
    override fun Base2.foo() {
        println("I'm Base2.foo in Y")
    }

    override fun Extended2.foo() {
        println("I'm Extended2.foo in Y")
    }
}

fun main() {
    val x = X()
    val y = Y()
    x.deal(Base2())
    y.deal(Base2())
    x.deal(Extended2())
    y.deal(Extended2())
    //I'm Base2.foo in X
    //I'm Base2.foo in Y dispatch receiver 被动态处理
    //I'm Base2.foo in X extension receiver 被静态处理
    //I'm Base2.foo in Y

    /*
    通过以上例子，我们可以总结出扩展函数几个需要注意的地方：
·如果该扩展函数是顶级函数或成员函数，则不能被覆盖；
·我们无法访问其接收器的非公共属性；
·扩展接收器总是被静态调度。
     */
}
