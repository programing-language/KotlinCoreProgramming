package core.lambdaAndCollection.collectionLibraryDesign

import core.lambdaAndCollection.collectionLibraryDesign.FooJava.foo

/**
 * Created by ChenJinXin on 2021/7/1 下午5:08
 */
fun test(){
    //Kotlin的可变集合与只读集合的区别其实就是，Kotlin将可变集合中的修改、添加、删除等方法移除之后，原来的可变集合就变成了只读集合。
    val list = mutableListOf(1, 2, 3, 4, 5)
    println(list)
    list[0] = 0
    println(list)

    val list2 = listOf(1,2,3,4,5)
    println(list2)
    // list2[0] = 0 error
}

fun test2(){
    //我们并不能说只读列表就是无法被改变的。
    // 在Kotlin中，我们将List称为只读列表而不是可变列表是有原因的，因为在某些情况下只读列表确实是可以被改变的，比如：
    val writeList:MutableList<Int> = mutableListOf(1,2,3,4)
    val readList :List<Int> = writeList
    println(readList)
    writeList[0] = 0
    println(readList)
}

fun test3(){
    //在另一种情况下，只读集合也是能够被修改的。我们说，Kotlin的集合都是基于Java来进行构建的，并且Kotlin与Java是兼容的。
    // 这就意味着我们可以在Kotlin的集合操作中调用在Java中定义的方法。这样就很容易出现问题了，因为在Java中是不区分只读集合与可变集合的。
    // 比如，我们用Java的代码定义了一个集合操作：
    fun bar(list:List<Int>){
        println(foo(list))
    }
    val list = listOf(1,2,3,4)
    bar(list)
}
fun main() {
    test3()
}