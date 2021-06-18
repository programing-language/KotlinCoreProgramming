package core.obj.oriented.cls.inter

/**
 * Created by chenjinxin on 2021/6/18 上午10:24
 */
class Bird6(weight:Double,age:Int,color:String){
    val weight:Double
    val age:Int
    val color:String
    init {
        this.weight = weight
        println("The bird's weight is ${this.weight}")
        this.age = age
        println("The bird's age is ${this.age}")
    }

    init {
        this.color = color
        println("The bird's color is ${this.color}")
    }
}
fun main() {
    val bird = Bird6(1000.0, 2,"blue")
}