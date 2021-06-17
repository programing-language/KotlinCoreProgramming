package basic.grammar.demo5Kelihua

/**
 * Created by chenjinxin on 2021/6/15 下午5:55
 */

fun sum(x: Int) = { y: Int ->
    { z: Int -> x + y + z }
}

// 如果一个函数只有一个参数，且该参数为函数类型，那么在调用该函数时，外面的括号就可以省略，就像这样子：
fun omitParentheses(block: () -> Unit) {
    block()
}

// 如果参数不止一个，且最后一个参数为函数类型时，就可以采用类似柯里化风格的调用：
fun curryingLike(content: String, block: (String) -> Unit) {
    block(content)
}

fun main() {
//    println(sum(1)(2)(3))
    omitParentheses {
        println("parentheses is omitted")
    }

    curryingLike("looks like currying style") { content ->
        println(content)
    }

    curryingLike("looks like currying style", { content ->
        println(content)
    })
}