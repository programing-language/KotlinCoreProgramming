package core.typeSystem.generic

import java.lang.reflect.ParameterizedType
import java.lang.reflect.Type

/**
 * Created by ChenJinXin on 2021/6/30 下午2:39
 */
open class GenericsToken<T> {
    var type: Type = Any::class.java

    init {
        val superClass = this.javaClass.genericSuperclass
        type = (superClass as ParameterizedType).actualTypeArguments[0]
    }
}

fun main() {
    val gt = object : GenericsToken<Map<String, String>>() {} //使用object创建一个匿名内部类
    println(gt.type)
}