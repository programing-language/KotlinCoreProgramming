package exploration.designPatterns.creation.factoryModel

/**
 * Created by ChenJinXin on 2021/7/8 下午2:02
 */
object ComputerFactory2 {
    //用object代替class
    fun produce(type: ComputerType): Computer {
        return when(type){
            ComputerType.PC -> PC()
            ComputerType.Server -> Server()
        }
    }
}

fun main() {
    val comp = ComputerFactory2.produce(ComputerType.Server)
    println(comp.cpu)
}