package core.lambdaAndCollection.lazyCollection

/**
 * Created by ChenJinXin on 2021/7/1 下午5:32
 */
fun main() {
    //在使用序列的时候，filter方法和map方法的操作都没有创建额外的集合，这样当集合中的元素数量巨大的时候，就减少了大部分开销。
    val list = listOf(1, 2, 3, 4, 5)
    val newList = list.asSequence().filter { it > 2 }.map { it * 2 }.toList()
    println(newList)
}