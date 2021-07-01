package core.lambdaAndCollection.lazyCollection

/**
 * Created by ChenJinXin on 2021/7/1 下午5:35
 */
fun main() {
    val list = listOf(1, 2, 3, 4, 5)

    val newList = list.asSequence().filter {
        println("filter($it)")
        it > 2
    }.map {
        println("map($it)")
        it * 2
    }
    println(newList)
    //println方法根本就没有被执行，这说明filter方法和map方法的执行被延迟了，这就是惰性求值的体现。

    println(newList.toList())
    //末端操作就是一个返回结果的操作，它的返回值不能是序列，必须是一个明确的结果
    /*
    filter(1)
    filter(2)
    filter(3)
    map(3)
    filter(4)
    map(4)
    filter(5)
    map(5)
    [6, 8, 10]
     */
    //普通集合在进行链式操作的时候会先在list上调用filter，然后产生一个结果列表，接下来map就在这个结果列表上进行操作。
    // 而序列则不一样，序列在执行链式操作的时候，会将所有的操作都应用在一个元素上，
    // 也就是说，第1个元素执行完所有的操作之后，第2个元素再去执行所有的操作，以此类推。
    // 反映到我们这个例子上面，就是第1个元素执行了filter之后再去执行map，然后第2个元素也是这样。


}