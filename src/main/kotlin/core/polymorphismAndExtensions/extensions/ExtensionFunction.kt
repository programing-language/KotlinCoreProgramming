package core.polymorphismAndExtensions.extensions

/**
 * Created by ChenJinXin on 2021/7/5 下午5:43
 */
fun MutableList<Int>.exchange(fromIndex: Int, toIndex: Int) {
    val tmp = this[fromIndex]
    this[fromIndex] = this[toIndex]
    this[toIndex] = tmp
}

fun main() {
    val list = mutableListOf<Int>(1, 2, 3)
    list.exchange(1, 2)
    println(list)
}