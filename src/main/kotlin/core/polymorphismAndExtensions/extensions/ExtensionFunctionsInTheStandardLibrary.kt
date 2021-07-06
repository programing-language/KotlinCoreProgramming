package core.polymorphismAndExtensions.extensions

import basic.grammar.expression.a

/**
 * Created by ChenJinXin on 2021/7/6 下午5:41
 */
fun testRun() {
    val nickName = "Prefert"
    run {
        //在run函数中我们拥有一个单独的作用域，能够重新定义一个nickName变量，并且它的作用域只存在于run函数中。
        val nickName = "YarenTang"
        println(nickName)
    }
    println(nickName)
}

//let和apply类似，唯一不同的是返回值：apply返回的是原来的对象，而let返回的是闭包里面的值。
data class Student(val age: Int)

fun getStu(): Student {
    return Student(18)
}

class Kot {
    val student: Student? = getStu()
    fun dealStu() {
        //由于let函数返回的是闭包的最后一行，当student不为null的时候，才会打印并返回它的年龄。与run一样，它同样限制了变量的作用域。
        val result = student?.let {
            println(it.age)
            it.age
        }
        println(result)
    }
}

fun testLet() {
    Kot().dealStu()
}


class Kot2 {
    val student: Student? = getStu()
    var age = 0
    fun dealStu() {
        //与apply一致，它的返回值是该函数的接收者
        val result = student?.also { stu ->
            this.age += stu.age
            println(this.age)
            println(stu.age)
            this.age
        }
        println(result)
    }
}

fun testAlso() {
    Kot2().dealStu()
}

class Kot3 {
    val student: Student? = getStu()
    fun dealStu() {
        //与apply一致，它的返回值是该函数的接收者
        val result = student?.takeIf { it.age >= 18 }?.let { stu ->
            println(stu.age)
            stu
        }
        println(result)
    }
}

fun testTakeIf() {
    Kot3().dealStu()
}

fun main() {
//    testRun()
//    testLet()
//    testAlso()
    testTakeIf()
}