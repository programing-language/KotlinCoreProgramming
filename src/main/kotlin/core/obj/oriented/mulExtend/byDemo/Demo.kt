package core.obj.oriented.mulExtend.byDemo

/**
 * Created by chenjinxin on 2021/6/24 下午5:21
 */
interface CanFly {
    fun fly()
}

interface CanEat {
    fun eat()
}

open class Flyer : CanFly {
    override fun fly() {
        println("I can fly")
    }
}

open class Animal:CanEat{
    override fun eat() {
        println("I can eat")
    }
}

class Bird(flyer:Flyer, animal: Animal):CanFly by flyer,CanEat by animal{}

fun main() {
    val flyer = Flyer()
    val animal = Animal()
    val b = Bird(flyer, animal)
    b.fly()
    b.eat()
}