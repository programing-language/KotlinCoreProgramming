package core.obj.oriented.staticToObject.anonymousInnerCla

import java.util.*
import kotlin.Comparator

/**
 * Created by ChenJinXin on 2021/6/25 下午4:39
 *
 * 简单来看，object表达式跟Java的匿名内部类很相似，但是我们发现，object表达式可以赋值给一个变量，这在我们重复使用的时候将会减少很多代码。
 * 另外，我们说过object可以继承类和实现接口，匿名内部类只能继承一个类及实现一个接口，而object表达式却没有这个限制。
 *
 * 用于代替匿名内部类的object表达式在运行中不像我们在单例模式中说的那样，全局只存在一个对象，而是在每次运行时都会生成一个新的对象。
 */
fun test() {
    val comparator = object : Comparator<String> {
        override fun compare(o1: String?, o2: String?): Int {
            if (o1 == null) {
                return -1
            } else if (o2 == null) {
                return 1
            }
            return o1.compareTo(o2)
        }
    }

    val list = listOf<String>("redPack", "score", "card")
    Collections.sort(list, comparator)
    println(list)
}

/**
 * Lambda表达式对有些场景实现起来更加适合，比如接口中只有单个方法的实现。
 */
fun test2() {
    val comparator = Comparator<String> { o1, o2 ->
        if (o1 == null) {
            return@Comparator -1
        } else if (o2 == null) {
            return@Comparator 1
        }
        o1.compareTo(o2)
    }

    val list = listOf<String>("redPack", "score", "card")
    Collections.sort(list, comparator)
    println(list)
}

fun main() {
    test()
    test2()
}