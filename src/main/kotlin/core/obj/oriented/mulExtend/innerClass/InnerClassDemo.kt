package core.obj.oriented.mulExtend.innerClass

/**
 * Created by chenjinxin on 2021/6/24 下午5:09
 */
class OuterKotlin {
    val name = "this is truely Kotlin's inner class syntax"

    inner class InnerKotlin {
        fun printName() {
            print("the name is $name")
        }
    }
}

fun main() {
    OuterKotlin().InnerKotlin().printName()
}