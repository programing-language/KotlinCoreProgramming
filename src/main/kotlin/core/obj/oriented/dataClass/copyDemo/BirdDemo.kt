package core.obj.oriented.dataClass.copyDemo

/**
 * Created by chenjinxin on 2021/6/24 下午5:52
 */
fun main() {
    // 声明的Bird属性可变
    val b1 = Bird(20.0, 1, "blue")
    val b2 = b1
    b2.color = "red"
    val b5 = b2.copy(age = 3)
    println(b1.toString())
    println(b2.toString())
    println(b5.toString())

    // 声明的Bird属性不可变
    val b3 = Bird2(21.0, 2,"yellow")
    val b4 = b3.copy(age = 5) //只能通过copy
    /*val b6 = b3
    b6.age = 6*/
    println(b3.toString())
    println(b4.toString())

    //Bird(weight=20.0, age=1, color=red)
    //Bird(weight=20.0, age=1, color=red)
    //Bird(weight=20.0, age=3, color=red)
    //Bird2(weight=21.0, age=2, color=yellow)
    //Bird2(weight=21.0, age=5, color=yellow)
}