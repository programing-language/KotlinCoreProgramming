package core.lambdaAndCollection.collectionOfHigherOrderFunctionsAPI

/**
 * Created by ChenJinXin on 2021/7/1 下午2:40
 */
fun test3() {
    val scoreTotal = students.sumBy { it.score }
    println(scoreTotal)

    val a = listOf<Int>(1, 2, 3, 4, 5)
    val b = listOf<Double>(1.1, 2.5, 3.0, 4.5)
    val aTotal = a.sumBy { it }
    val bTotal = b.sum()
    println(aTotal)
    println(bTotal)
}

fun test4() {
    val scoreTotal = students.fold(0) { acc: Int, student: Student -> acc + student.score }
    println(scoreTotal)
}

fun test5() {
    val a = listOf<Int>(1, 2, 3, 4, 5)
    val aTotal = a.reduce { acc, i -> acc + i }
    println(aTotal)
}

fun main() {
    test3()
    test4()
    test5()
}