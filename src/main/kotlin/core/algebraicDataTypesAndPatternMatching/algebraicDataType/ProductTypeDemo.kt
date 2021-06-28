package core.algebraicDataTypesAndPatternMatching.algebraicDataType

/**
 * Created by ChenJinXin on 2021/6/28 下午2:28
 */
class BooleanProductUnit(a:Boolean, b:Unit){
    override fun toString(): String {
        return "BooleanProductUnit()"
    }
}

val a = BooleanProductUnit(false,Unit)
val b = BooleanProductUnit(true,Unit)

fun main() {
    println(a)
    println(b)
}