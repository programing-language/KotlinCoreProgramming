package core.typeSystem.moreObjectOrientedDesignThanJava

/**
 * Created by ChenJinXin on 2021/6/29 下午5:40
 */
fun main() {
    //Kotlin的Type Checker强制检查了父子关系。例如，你可以将子类型值存储到父类型变量中：
    var f: Animal = Bird(weight = 0.1, flightSpeed = 15.0)
    f = Fish(weight = 0.15, swimmingSpeed = 10.0)
    //但是你不能将父类型值存储到子类型变量中：
    /*val b = Bird(weight = 0.1, flightSpeed = 15.0)
    val f2:Animal = b
    val b2:Bird = f2*/
}
/*另外，Kotlin把Java方法参数和返回类型中用到的Object类型看作Any（更确切地说是当作“平台类型”）。当在Kotlin函数中使用Any时，它会被编译成Java字节码中的Object。
什么是平台类型？
平台类型本质上就是Kotlin不知道可空性信息的类型，所有Java引用类型在Kotlin中都表现为平台类型。当在Kotlin中处理平台类型的值的时候，它既可以被当作可空类型来处理，也可以被当作非空类型来操作。
平台类型的引入是Kotlin兼容Java时的一种权衡设计。试想下，如果所有来自Java的值都被看成非空，那么就容易写出比较危险的代码。反之，如果Java中的值都强制当作可空，则会导致大量的null检查。综合考量，平台类型是一种折中的设计方案。
 */