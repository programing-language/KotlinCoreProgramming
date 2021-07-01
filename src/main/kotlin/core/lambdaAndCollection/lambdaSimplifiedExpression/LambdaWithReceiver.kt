package core.lambdaAndCollection.lambdaSimplifiedExpression

/**
 * Created by ChenJinXin on 2021/7/1 下午2:03
 */
fun test() {
    val sum: Int.(Int) -> Int = { other -> plus(other) }
    println(2.sum(1))
}

class HTML {
    fun body() {

    }
}

fun html(init: HTML.() -> Unit): HTML {
    val html = HTML() //创建了接受者对象
    html.init() //把接收者对象传递给Lambda
    return html
}


fun main() {
//    test()
    html {
        body() //调用接受者对象的body方法
    }
}