package core.obj.oriented.mulExtend

/**
 * Created by chenjinxin on 2021/6/24 下午4:39
 */
interface Flyer {
    fun fly()
    fun kind() = "Flyer flying animals"
}

interface Animal {
    val name: String
    fun eat()
    fun kind() = "Animal flying animals"
}

class Bird(override val name: String) : Flyer, Animal {
    override fun fly() {
        println("I can fly")
    }

    override fun eat() {
        println("I can eat")
    }

    override fun kind(): String {
        return super<Flyer>.kind()
    }
}

class Bird2(override val name: String) : Flyer, Animal {
    override fun fly() {
        println("I can fly")
    }

    override fun eat() {
        println("I can eat")
    }

    override fun kind() = "a flying ${this.name}"
}

fun main() {
    val bird = Bird("sparrow")
    println(bird.kind())

    val bird2 = Bird2("sparrow")
    println(bird2.kind())
}