package core.obj.oriented.mulExtend.innerClass

/**
 * Created by chenjinxin on 2021/6/24 下午5:12
 */

/*
通过这个修改后的例子可以发现：
1）我们可以在一个类内部定义多个内部类，每个内部类的实例都有自己的独立状态，它们与外部对象的信息相互独立；
2）通过让内部类HorseC、DonkeyC分别继承Horse和Donkey这两个外部类，我们就可以在Mule类中定义它们的实例对象，从而获得了Horse和Donkey两者不同的状态和行为；
3）我们可以利用private修饰内部类，使得其他类都不能访问内部类，具有非常良好的封装性。
因此，可以说在某些场合下，内部类确实是一种解决多继承非常好的思路。
 */
open class Horse { // 马
    fun runFast() {
        println("I can run fast")
    }
}

open class Donkey { // 驴
    fun doLongTimeThing() {
        println("I can do some thing long time")
    }
}

class Mule { // 骡子
    fun runFast() {
        HorseC().runFast()
    }

    fun doLongTimeThing() {
        DonkeyC().doLongTimeThing()
    }

    private inner class HorseC : Horse()
    private inner class DonkeyC : Donkey()
}

fun main() {
    val mule = Mule()
    mule.runFast()
    mule.doLongTimeThing()
}