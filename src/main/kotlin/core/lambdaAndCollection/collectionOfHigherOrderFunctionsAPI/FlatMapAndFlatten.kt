package core.lambdaAndCollection.collectionOfHigherOrderFunctionsAPI

/**
 * Created by ChenJinXin on 2021/7/1 下午4:30
 */
fun test7() {
    val list = listOf(listOf(jilen, shaw, lisa), listOf(yison, pan), listOf(jack))
    val newList = list.flatten()
    println(newList)
    val nameList = list.flatten().map { it.name }
    println(nameList)
}

fun test8() {
    val list = listOf(listOf(jilen, shaw, lisa), listOf(yison, pan), listOf(jack))
    val newList = list.flatMap { it.map { it.name } }
    println(newList)
}

fun test9() {
    data class Student(val name: String, val age: Int, val sex: String, val score: Int, val hobbies: List<String>)

    val jilen = Student("Jilen", 30, "m", 85, listOf("coding","reading"))
    val shaw = Student("Shaw", 18, "m", 90, listOf("drinking","fishing"))
    val yison = Student("Yison", 40, "f", 59, listOf("running","game"))
    val jack = Student("Jack", 30, "m", 70, listOf("drawing"))
    val lisa = Student("Lisa", 25, "f", 88, listOf("writing"))
    val pan = Student("Pan", 36, "f", 55, listOf("dancing"))

    val students = listOf<Student>(jilen, shaw, yison, jack, lisa, pan)

    val hobbiesList = students.map { it.hobbies }.flatten()
    println(hobbiesList)
    val hobbiesList2 = students.flatMap { it.hobbies }
    println(hobbiesList2)
}

fun main() {
//    test7()
//    test8()
    test9()
}