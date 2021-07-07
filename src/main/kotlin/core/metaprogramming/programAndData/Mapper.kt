package core.metaprogramming.programAndData

import core.metaprogramming.User
import kotlin.reflect.KProperty
import kotlin.reflect.full.memberProperties

/**
 * Created by ChenJinXin on 2021/7/7 下午4:52
 */
object Mapper {
    fun <A : Any> toMap(a: A): Map<String, Any?> {
        // 获取A中所有的属性
        return a::class.memberProperties.map { m ->
            val p = m as KProperty<*>
            p.name to p.call(a)
        }.toMap()
    }
}

fun main() {
    val result = Mapper.toMap(User("humora", 17))
    result.forEach { (key, value) ->
        println("$key -> $value")
    }
}