package core.obj.oriented.privateclass

/**
 * Created by chenjinxin on 2021/6/24 上午11:26
 */
class BMWCar(val name: String) {
    private val bMWEngine = Engine("BMW")
    fun getEngine():String{
        return bMWEngine.engineType()
    }
}

private class Engine(val type: String) {
    fun engineType(): String {
        return "the engine type is $type"
    }
}

fun main() {
    println(BMWCar("cc").getEngine())
}