package exploration.designPatterns.creation.factoryModel

/**
 * Created by ChenJinXin on 2021/7/8 下午2:02
 */
interface Computer2 {
    val cpu: String

    companion object {
        operator fun invoke(type: ComputerType): Computer {
            return when(type){
                ComputerType.PC -> PC()
                ComputerType.Server -> Server()
            }
        }
    }
}

fun main() {
    val comp = Computer2(ComputerType.Server)
    println(comp.cpu)
}