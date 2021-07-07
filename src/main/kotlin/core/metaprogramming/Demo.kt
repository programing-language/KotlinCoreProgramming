package core.metaprogramming

/**
 * Created by ChenJinXin on 2021/7/7 下午4:43
 */
class User(val name: String, val age: Int) {
    fun toMap(a: User): Map<String, Any> {
        return hashMapOf<String, Any>("name" to a.name, "age" to a.age)
    }
}

fun main() {
    val user = User("cjx", 22)
    val result = user.toMap(user)
    result.forEach { (key, value) ->
        println("$key -> $value")
    }
}