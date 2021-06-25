package core.obj.oriented.dataClass.componentNDemo

/**
 * Created by chenjinxin on 2021/6/25 下午3:32
 */
/**
 * 数据类中的解构基于componentN函数，如果自己不声明componentN函数，那么就会默认根据主构造函数参数来生成具体个数的componentN函数，与从构造函数中的参数无关。
 */
data class Bird(var weight: Double, var age: Int, var color: String) {
    var sex = 1
    operator fun component4(): Int {//operator关键字
        return this.sex
    }

    constructor(weight: Double, age: Int, color: String, sex: Int) : this(weight, age, color) {
        this.sex = sex
    }
}

fun main() {
    val b1 = Bird(20.0, 1, "blue", 0)
    val (weight, age, color, sex) = b1
    println(b1.toString())
    println("$weight, $age, $color, $sex")
}