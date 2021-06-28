package core.algebraicDataTypesAndPatternMatching.patternMatching

/**
 * Created by ChenJinXin on 2021/6/28 下午3:07
 */
fun constantPattern(a: Int) = when (a) {
    1 -> "It is 1"
    2 -> "It is 2"
    else -> "It is other number"
}

fun main() {
    println(constantPattern(1))
}