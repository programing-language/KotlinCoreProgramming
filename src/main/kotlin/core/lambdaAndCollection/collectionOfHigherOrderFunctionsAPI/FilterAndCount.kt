package core.lambdaAndCollection.collectionOfHigherOrderFunctionsAPI

/**
 * Created by ChenJinXin on 2021/7/1 下午2:31
 */
data class Student(val name: String, val age: Int, val sex: String, val score: Int)

val jilen = Student("Jilen", 30, "m", 85)
val shaw = Student("Shaw", 18, "m", 90)
val yison = Student("Yison", 40, "f", 59)
val jack = Student("Jack", 30, "m", 70)
val lisa = Student("Lisa", 25, "f", 88)
val pan = Student("Pan", 36, "f", 55)

val students = listOf<Student>(jilen, shaw, yison, jack, lisa, pan)

fun test2() {
    val mStudents = students.filter { it.sex == "m" }
    val fStudents = students.filterNot { it.sex == "m" }

    val countMStudent = students.count { it.sex == "m" }
    val countFStudent = students.count { it.sex == "f" }
}