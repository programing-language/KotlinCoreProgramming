package exploration.designPatterns.creation.factoryModel.abstractFactory

/**
 * Created by ChenJinXin on 2021/7/8 下午2:35
 */
interface Computer
class Dell : Computer
class Asus : Computer
class Acer : Computer

abstract class AbstractFatory {
    abstract fun produce(): Computer

    companion object {
        operator fun invoke(factory: AbstractFatory): AbstractFatory {
            return factory
        }
    }
}

class DellFactory : AbstractFatory() {
    override fun produce() = Dell()
}

class AsusFactory : AbstractFatory() {
    override fun produce() = Asus()
}

class AcerFactory : AbstractFatory() {
    override fun produce() = Acer()
}

fun main() {
    val dellFatory = AbstractFatory(DellFactory())
    val dell = dellFatory.produce()
    println(dell)
}