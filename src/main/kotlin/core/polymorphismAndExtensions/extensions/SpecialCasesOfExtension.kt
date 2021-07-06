package core.polymorphismAndExtensions.extensions

/**
 * Created by ChenJinXin on 2021/7/5 下午5:56
 */
//类似Java的静态扩展函数
// 但是当我们想让第三方类库也支持这样的写法时，我们发现，并不是所有的第三方类库中的类都存在伴生对象，我们只能通过它的实例来进行调用，但这样会造成很多不必要的麻烦。
class Son {
    companion object {
        const val age = 10
    }
}

fun Son.Companion.foo(){
    println("age = $age")
}

fun main() {
    Son.foo()//age = 10
}