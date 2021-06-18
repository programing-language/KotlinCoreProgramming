package basic.grammar.stringDefOperator

/**
 * Created by chenjinxin on 2021/6/17 下午5:21
 */
fun main() {
    fun message(name: String, lang: String) = "Hi ${name}, welcome to ${lang}!"
    println(message("Shaw", "Kotlin"))

    // 也可以把表达式通过同样的方式插入字符串中，并且在${expression}中使用双引号。
    fun ifLength(str:String) = "$str has ${if (str.isNotEmpty()) str.length else "no"} letters."
    println(ifLength("Kotlin"))

}