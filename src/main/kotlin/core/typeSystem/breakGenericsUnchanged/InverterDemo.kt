package core.typeSystem.breakGenericsUnchanged

/**
 * Created by ChenJinXin on 2021/6/30 下午3:30
 */
fun test(){
    val doubleComparator = Comparator<Double> { d1, d2 ->
        d1.compareTo(d2)
    }

    val doubleList = mutableListOf<Double>(2.0, 3.0, 1.0)
    doubleList.sortWith(doubleComparator)
    println(doubleList)
}

fun test2(){
    val numberComparator = Comparator<Number> { n1, n2 ->
        n1.toDouble().compareTo(n2.toDouble())
    }

    val doubleList = mutableListOf<Double>(2.0, 3.0, 1.0)
    doubleList.sortWith(numberComparator)
    println(doubleList)

    val intList = mutableListOf<Int>(2,3,1)
    intList.sortWith(numberComparator)
    println(intList)
}
fun main() {
//   test()
    test2()
}