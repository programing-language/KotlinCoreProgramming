package basic.grammar.enumWhen

/**
 * Created by chenjinxin on 2021/6/17 上午10:45
 */
fun basketball() = {}
fun fishing() = {}
fun appointment() = {}
fun library() = {}
fun study() = {}
fun schedule(sunny: Boolean, day: Day) = when (day) {
    Day.SAT -> basketball()
    Day.SUN -> fishing()
    Day.FRI -> appointment()
    else -> when {
        sunny -> library()
        else -> study()
    }
}

fun schedule2(sunny: Boolean, day: Day) = when {
    day == Day.SAT -> basketball()
    day == Day.SUN -> fishing()
    day == Day.FRI -> appointment()
    sunny -> library()
    else -> study()
}

fun foo(a: Int) = when (a) {
    1 -> 1
    2 -> 2
    else -> 0
}

fun main() {

}