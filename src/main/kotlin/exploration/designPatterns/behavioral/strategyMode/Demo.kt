package exploration.designPatterns.behavioral.strategyMode

/**
 * Created by ChenJinXin on 2021/7/8 下午5:45
 */
interface SwimStrategy {
    fun swim()
}

class Breaststroke : SwimStrategy {
    override fun swim() {
        println("I am breaststroking...")
    }
}

class Backstroke : SwimStrategy {
    override fun swim() {
        println("I am backstroke...")
    }
}

class Freestyle : SwimStrategy {
    override fun swim() {
        println("I am freestyling...")
    }
}

class Swimmer(val strategy: SwimStrategy) {
    fun swim() {
        strategy.swim()
    }
}

fun main() {
    val weekendShaw = Swimmer(Freestyle())
    weekendShaw.swim()
    val weekdaysShaw = Swimmer(Breaststroke())
    weekdaysShaw.swim()
}