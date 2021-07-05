package core.polymorphismAndExtensions.differentWaysOfPolymorphism

/**
 * Created by ChenJinXin on 2021/7/5 下午5:19
 */

//参数多态在程序设计语言与类型论中是指声明与定义函数、复合类型、变量时不指定其具体的类型，而把这部分类型作为参数使用，
// 使得该定义对各种具体类型都适用，所以它建立在运行时的参数基础上，并且所有这些都是在不影响类型安全的前提下进行的。
interface KeyI {
    val uniqueKey: String
}

class ClassA(override val uniqueKey: String):KeyI{

}
class ClassB(override val uniqueKey: String):KeyI{

}

fun <T:KeyI> persist(t:T){
    save(t.uniqueKey, t)
}

fun <T:KeyI> save(uniqueKey: String, t:T){

}

fun main() {
    val a = ClassA("a")
    val b = ClassB("b")
    persist(a)
    persist(b)
}