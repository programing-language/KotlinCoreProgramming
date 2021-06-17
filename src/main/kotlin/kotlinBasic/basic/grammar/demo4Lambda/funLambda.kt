package kotlinBasic.basic.grammar.demo4Lambda

/**
 * Created by chenjinxin on 2021/6/15 下午5:31
 */

//fun在没有等号、只有花括号的情况下，是我们最常见的代码块函数体，如果返回非Unit值，必须带return。
fun foo(x: Int) {
    println(x)
}

fun foo(x: Int, y: Int): Int {
    return x * y
}

// fun带有等号，是单表达式函数体。该情况下可以省略return。
fun foo2(x: Int, y: Int) = x + y

// 不管是用val还是fun，如果是等号加花括号的语法，那么构建的就是一个Lambda表达式，Lambda的参数在花括号内部声明。
// 所以，如果左侧是fun，那么就是Lambda表达式函数体，也必须通过（）或invoke来调用Lambda，如：
val foo3 = { x: Int, y: Int -> x + y } // foo.invoke(1, 2)或foo(1, 2)
fun foo4(x: Int) = { y: Int -> x + y } // foo(1).invoke(2)或foo(1)(2)

fun main() {
    // Kotlin还支持一种自运行的Lambda语法：
//    { x: Int -> println(x) }(1)
    { x: Int -> println(if (x == 1 || x == 0) 1 else if (x == 2) 2 else 3) }(3)
}