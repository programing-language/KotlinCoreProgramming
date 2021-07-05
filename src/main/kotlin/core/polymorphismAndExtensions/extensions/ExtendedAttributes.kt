package core.polymorphismAndExtensions.extensions

/**
 * Created by ChenJinXin on 2021/7/5 下午5:48
 */

//扩展属性不能有初始化器
val MutableList<Int>.sumIsEven: Boolean
    get() = this.sum() % 2 == 0

fun main() {
    val list = mutableListOf<Int>(2, 2, 4)
    println(list.sumIsEven)
}