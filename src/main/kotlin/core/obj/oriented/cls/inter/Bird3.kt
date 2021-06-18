package core.obj.oriented.cls.inter

/**
 * Created by chenjinxin on 2021/6/18 上午10:37
 */
class Bird3(
        weight: Double = 0.00,
        age: Int = 0,
        color: String = "blue") {

    val weight: Double
    val age: Int
    val color: String

    init {
        this.weight = weight
        this.age = age
        this.color = color
    }
}