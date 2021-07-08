package exploration.designPatterns.creation.factoryModel

/**
 * Created by ChenJinXin on 2021/7/8 下午2:02
 */
object ComputerFactory3 {
    operator fun invoke(type: ComputerType): Computer {
        return when(type){
            ComputerType.PC -> PC()
            ComputerType.Server -> Server()
        }
    }
}

fun main() {
    val comp = ComputerFactory3(ComputerType.Server)
    println(comp.cpu)
}