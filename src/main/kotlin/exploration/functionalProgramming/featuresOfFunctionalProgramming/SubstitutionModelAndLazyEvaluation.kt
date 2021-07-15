package exploration.functionalProgramming.featuresOfFunctionalProgramming

/**
 * Created by ChenJinXin on 2021/7/15 下午5:56
 */
fun lazyPrintln(msg:String) = { println(msg)}

fun main() {
    // 当我们的程序调用lazyPrintln（"I am a IO operation."）的时候，它仅仅只是返回一个可以进行println的函数，它是惰性的，也是可替代的。
    // 这样，我们就可以在程序中将这些IO操作进行组合，最后再执行它们。
    val p = lazyPrintln("Hello")
    p.invoke()
}