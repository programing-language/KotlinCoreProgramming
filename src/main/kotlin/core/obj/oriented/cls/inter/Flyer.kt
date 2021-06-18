package core.obj.oriented.cls.inter

/**
 * Created by chenjinxin on 2021/6/18 上午10:29
 */
interface Flyer {
    val speed: Int
    val height
        get() = 1000

    fun kind()
    fun fly() {
        println("I can fly")
    }
}