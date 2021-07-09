package exploration.functionalProgramming.featuresOfFunctionalProgramming

/**
 * Created by ChenJinXin on 2021/7/9 下午5:56
 */
fun stringInterpreter(str: List<Format>) = str.fold("") { fullText, s ->
    when (s) {
        is Print -> fullText + s.text
        is Newline -> fullText + "\n"
    }
}

fun main() {
    val format1 = Print("format1")
    val format2 = Print("format2")
    val result = stringInterpreter(listOf(format1, Newline, format2))
    println(result)
}