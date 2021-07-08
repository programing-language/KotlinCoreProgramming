package exploration.designPatterns.behavioral.strategyMode

/**
 * Created by ChenJinXin on 2021/7/8 下午5:52
 */
fun breaststroke() {
    println("I am breaststroking...")
}

fun backstroke() {
    println("I am backstroking...")
}

fun freestyle() {
    println("I am freestyling...")
}

class Swimmer2(val swimming: () -> Unit) {
    fun swim() {
        swimming()
    }
}

fun main() {
    val weekendShaw = Swimmer2(::freestyle)
    weekendShaw.swim()
    val weekdaysShaw = Swimmer2(::breaststroke)
    weekdaysShaw.swim()
}