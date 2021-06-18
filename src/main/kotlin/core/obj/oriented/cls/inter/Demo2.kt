package core.obj.oriented.cls.inter

/**
 * Created by chenjinxin on 2021/6/18 上午11:10
 */
class Bird8(val weight: Double, val age: Int, val color: String) {
    // 正常情况下，Kotlin规定类中的所有非抽象属性成员都必须在对象创建时被初始化值。
    // 在Kotlin中，我们主要使用lateinit和by lazy这两种语法来实现延迟初始化的效果。
    // printSex方法中，sex会被视为二次赋值，这对val声明的变量来说也是不允许的。必须是var变量
    private lateinit var sex: String

    fun printSex() {
        this.sex = if (this.color == "yellow") "male" else "female"
        println(this.sex)
    }
}

fun main() {
    val bird8 = Bird8(1000.0, 2, "blue")
    bird8.printSex()
}