package core.lambdaAndCollection.collectionOfHigherOrderFunctionsAPI

/**
 * Created by ChenJinXin on 2021/7/1 下午2:29
 */
fun test() {
    val list = listOf<Int>(1, 2, 3)
    fun foo(bar: Int) = bar * 2
    val newList = list.map { foo(it) }
    println(newList)
}

fun main() {
    test()
}