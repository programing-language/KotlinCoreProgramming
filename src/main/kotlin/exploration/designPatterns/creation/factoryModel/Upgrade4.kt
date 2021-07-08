package exploration.designPatterns.creation.factoryModel

/**
 * Created by ChenJinXin on 2021/7/8 下午2:02
 */
interface Computer3 {
    val cpu: String

    companion object Factory{
        operator fun invoke(type: ComputerType): Computer {
            return when(type){
                ComputerType.PC -> PC()
                ComputerType.Server -> Server()
            }
        }
    }
}

fun main() {
    val comp = Computer3.Factory(ComputerType.Server)
    println(comp.cpu)
}