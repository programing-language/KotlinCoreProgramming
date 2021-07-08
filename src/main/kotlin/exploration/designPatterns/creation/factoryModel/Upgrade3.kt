package exploration.designPatterns.creation.factoryModel

/**
 * Created by ChenJinXin on 2021/7/8 下午2:02
 */
interface Computer2 {
    val cpu: String

    companion object {

    }
}

fun main() {
    val comp = ComputerFactory3(ComputerType.Server)
    println(comp.cpu)
}