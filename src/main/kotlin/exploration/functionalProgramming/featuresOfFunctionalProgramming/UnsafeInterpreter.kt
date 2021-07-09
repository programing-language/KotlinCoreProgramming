package exploration.functionalProgramming.featuresOfFunctionalProgramming

/**
 * Created by ChenJinXin on 2021/7/9 下午5:44
 */
sealed class Format
data class Print(val text: String) : Format()
object Newline : Format()

val string = listOf<Format>(Print("Hello"), Newline, Print("Kotlin"))

fun unsafeInterpreter(str: List<Format>) {
    str.forEach {
        when (it) {
            is Print -> print(it.text)
            is Newline -> println()
        }
    }
}

fun main() {
    val format1 = Print("format1")
    val format2 = Print("format2")
    unsafeInterpreter(listOf(format1, Newline, format2))
}