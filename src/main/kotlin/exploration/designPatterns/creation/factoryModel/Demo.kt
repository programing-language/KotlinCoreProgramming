package exploration.designPatterns.creation.factoryModel

/**
 * Created by ChenJinXin on 2021/7/8 下午1:58
 */
interface Computer {
    val cpu: String
}

class PC(override val cpu: String = "Core") : Computer
class Server(override val cpu: String = "Xeon") : Computer

enum class ComputerType {
    PC,
    Server
}

class ComputerFactory {
    fun produce(type: ComputerType): Computer {
        return when (type) {
            ComputerType.PC -> PC()
            ComputerType.Server -> Server()
        }
    }
}

fun main() {
    val comp = ComputerFactory().produce(ComputerType.PC)
    println(comp.cpu)
}