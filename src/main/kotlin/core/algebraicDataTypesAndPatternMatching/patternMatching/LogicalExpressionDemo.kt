package core.algebraicDataTypesAndPatternMatching.patternMatching

/**
 * Created by ChenJinXin on 2021/6/28 下午3:14
 */
fun logicPattern(a: Int) = when {
    a in 2..11 -> ("$a is smaller than 10 and bigger than 1")
    else -> "Maybe $a is bigger than 10, or smaller than 1"
}

fun logicPattern(a: String) = when {
    a.contains("Yison") -> "Something is about Yison"
    else -> "It's none of Yison's business"
}

fun main() {
    println(logicPattern(2))
    println(logicPattern("Yison is a good boy"))
}