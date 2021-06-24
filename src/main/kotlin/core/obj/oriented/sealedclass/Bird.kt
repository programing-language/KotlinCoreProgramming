package core.obj.oriented.sealedclass

/**
 * Created by chenjinxin on 2021/6/24 上午11:17
 */
// Kotlin通过sealed关键字来修饰一个类为密封类，若要继承则需要将子类定义在同一个文件中，其他文件中的类将无法继承它。
// 但这种方式有它的局限性，即它不能被初始化，因为它背后是基于一个抽象类实现的。
sealed class Bird {
    open fun fly() = "I can fly"

    object Eagle : Bird()
}