package core.polymorphismAndExtensions.extensions

/**
 * Created by ChenJinXin on 2021/7/5 下午5:56
 */

//类的实例与接收者的实例
//当在扩展函数里调用this时，指代的是接收者类型的实例。那么如果这个扩展函数声明在一个object内部，我们如何通过this获取到类的实例呢？
class Son3{
    fun foo(){
        println("foo in Class Son")
    }
}

//另外值得一提的是：如果Son扩展函数在Parent类内，我们将无法对其调用。
object Parent{
    fun foo(){
        println("foo in Class Parent")
    }

    @JvmStatic
    fun main(){
        fun Son3.foo2(){
            this.foo()
            this@Parent.foo()//这里我们可以用this@类名来强行指定调用的this。
        }

        Son3().foo2()
    }
}

fun main() {
    Parent.main()
    //foo in Class Son
    //foo in Class Parent
}