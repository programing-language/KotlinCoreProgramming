package core.typeSystem.nullableType

/**
 * Created by ChenJinXin on 2021/6/29 下午5:11
 */

fun main() {
    val obj = "abc"
    when(obj){
        is String -> println(obj.length)
        !is String -> println("obj Not a String")
    }
}