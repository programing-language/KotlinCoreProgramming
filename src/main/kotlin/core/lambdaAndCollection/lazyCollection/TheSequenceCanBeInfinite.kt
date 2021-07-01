package core.lambdaAndCollection.lazyCollection

/**
 * Created by ChenJinXin on 2021/7/1 下午5:45
 */
fun main() {
    val naturalNumList = generateSequence(0) { it + 1 }
    val list = naturalNumList.takeWhile { it <= 9 }.toList()
    println(list)
    //关于无限数列这一点，我们不能将一个无限的数据结构通过穷举的方式呈现出来，而只是实现了一种表示无限的状态，让我们在使用时感觉它就是无限的。
}