package basic.grammar.infixExpression

/**
 * Created by chenjinxin on 2021/6/17 上午11:15
 */
// infix fun <A, B> A.to(that: B): Pair<A, B>
/*
如果我们要定义一个中缀函数，它必须需满足以下条件：
·该中缀函数必须是某个类型的扩展函数或者成员方法；
·该中缀函数只能有一个参数；
·虽然Kotlin的函数参数支持默认值，但中缀函数的参数不能有默认值，否则以上形式的B会缺失，从而对中缀表达式的语义造成破坏；
·同样，该参数也不能是可变参数，因为我们需要保持参数数量始终为1个。
 */


// 函数可变参数
// Java中的可变参数必须是最后一个参数，Kotlin中没有这个限制，但两者都可以在函数体中以数组的方式来使用可变参数变量，正如以下例子：
fun printLetters(vararg letters: String, count: Int): Unit {
    print("$count letters are ")
    for (letter in letters) print(letter)
}

fun main() {
    printLetters("a", "b", "c", count = 3)

    // to
    mapOf(
            1 to "one",
            2 to "two",
            3 to "three"
    )
}