package kotlinBasic.basic.grammar.stringDefOperator

/**
 * Created by chenjinxin on 2021/6/17 下午5:12
 */
fun main() {
    val str = "hello world"
    println(str.length)
    println(str.substring(0, 5))
    println(str + " hello Kotlin!")
    println("$str hello Kotlin!")
    println(str.replace("world", "Kotlin"))

    for (s in str.toUpperCase()) {
        print(s)
    }

    println(str[0])
    println(str.first())
    println(str.last())
    println(str[str.length - 1])

    println("".isEmpty())
    println(" ".isEmpty())
    println(" ".isBlank())
    println("abcdefg".filter { c -> c in 'a'..'d' })

    // 更多字符串类方法可以查阅Kotlin API文档：https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html
}