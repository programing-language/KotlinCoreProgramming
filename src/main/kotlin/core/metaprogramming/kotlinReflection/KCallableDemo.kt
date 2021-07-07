package core.metaprogramming.kotlinReflection

import kotlin.reflect.KMutableProperty
import kotlin.reflect.full.memberProperties

/**
 * Created by ChenJinXin on 2021/7/7 下午5:44
 */
fun test() {
    val _1 = Succ(Nat.Companion.Zero)
    val preceed = _1::class.members.find { it.name == "preceed" }
    println(preceed?.call(_1, _1) == Nat.Companion.Zero)
}

class Person(val name: String, val age: Int, var address: String)

fun KMutablePropertyShow() {
    val p = Person("疾跑", 8, "GuangZhou")
    val props = p::class.memberProperties
    for (prop in props) {
        when (prop) {
            is KMutableProperty<*> -> prop.setter.call(p, "HeFei")
            else -> prop.call(p)
        }
    }
    println(p.address)//HeFei
}

fun main() {
    KMutablePropertyShow()
}