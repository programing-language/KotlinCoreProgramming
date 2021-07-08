package exploration.designPatterns.creation.factoryModel.abstractFactory

/**
 * Created by ChenJinXin on 2021/7/8 下午2:42
 */
abstract class AbstractFatory2 {
    abstract fun produce(): Computer

    companion object {
        inline operator fun <reified T : Computer> invoke(): AbstractFatory = when (T::class) {
            Dell::class -> DellFactory()
            Asus::class -> AsusFactory()
            Acer::class -> AcerFactory()
            else -> throw IllegalArgumentException()
        }
    }
}

fun main() {
    val dellFactory = AbstractFatory2<Dell>()
    val dell = dellFactory.produce()
    println(dell)
}