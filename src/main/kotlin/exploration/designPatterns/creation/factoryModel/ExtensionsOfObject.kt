package exploration.designPatterns.creation.factoryModel

/**
 * Created by ChenJinXin on 2021/7/8 下午2:17
 */
//当类是工程引入的第三方类库时，如果我们希望进一步改造其中的逻辑，可以使用扩展函数的特性实现需求。
fun Computer3.Factory.fromCPU(cpu: String): ComputerType? = when (cpu) {
    "Core" -> ComputerType.PC
    "Xeon" -> ComputerType.Server
    else -> null
}

fun main() {
    val type = Computer3.Factory.fromCPU("Core")
    println(type)
}