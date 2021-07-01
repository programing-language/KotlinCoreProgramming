package core.lambdaAndCollection.collectionLibraryDesign

/**
 * Created by ChenJinXin on 2021/7/1 下午5:00
 */
fun main() {
    //List表示一个有序的可重复的列表，其中元素的存储方式是线性存储的，以保证元素的有序性。另外，List中的元素也是可以重复的。
    val list = listOf(1, 2, 3, 4, 4, 5, 5)
    println(list)

    //Set表示一个不可重复的集合，Set常用的具体实现有两种，分别为HashSet和TreeSet。
    // HashSet是用Hash散列来存放数据的，不能保证元素的有序性；
    // 而TreeSet的底层结构是二叉树，它能保证元素的有序性。在不指定Set的具体实现时，我们一般说Set是无序的。另外Set中的元素是不能重复的。
    val set = setOf(1, 2, 3, 4, 4, 5, 5)
    println(set)

    //Kotlin中的Map与其他集合有点不同，它没有实现Iterable或者Collection。Map用来表示键值对元素集合
    val map = mapOf(1 to 1, 2 to 2, 3 to 3, 4 to 4)
    println(map)
}