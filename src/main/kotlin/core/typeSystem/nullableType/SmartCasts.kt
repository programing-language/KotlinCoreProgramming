package core.typeSystem.nullableType

/**
 * Created by ChenJinXin on 2021/6/29 下午5:14
 */
fun main() {
    val stu: Any = Student(Glasses(189.00))
    if (stu is Student) {
        println(stu.glasses)
    }
}

// 当且仅当Kotlin的编译器确定在类型检查后该变量不会再改变，才会产生Smart Casts。利用这点，我们能确保多线程的应用足够安全。举个例子：
class Kot {
    var stu: Student? = Student(Glasses(189.00))
    fun dealStu() {
        stu?.let { print(it.glasses) }
    }
}