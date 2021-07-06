package core.polymorphismAndExtensions.extensionsNotAPanacea

/**
 * Created by ChenJinXin on 2021/7/6 下午6:09
 */
open class Base
class Extended:Base()
fun Base.foo() = "I'm Base.foo"
fun Extended.foo() = "I'm Extended.foo"
fun main() {
    val instance :Base = Extended()
    val instance2 = Extended()
    println(instance.foo())
    println(instance2.foo())
    //I'm Base.foo
    //I'm Extended.foo
}