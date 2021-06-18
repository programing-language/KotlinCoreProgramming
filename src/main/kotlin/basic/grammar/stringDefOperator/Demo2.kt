package basic.grammar.stringDefOperator

/**
 * Created by chenjinxin on 2021/6/17 下午5:19
 */
fun main() {
    // 用这种3个引号定义的字符串，最终的打印格式与在代码中所呈现的格式一致，而不会解释转化转义字符（正如上述例子中的\n），以及Unicode的转义字符（如\uXXXX）。
    val rawString = """
    \n Kotlin is awesome.
    \n Kotlin is a better Java."""
    println(rawString)

    val html = """
    <html>
       <body>
           <p>Hello World.</p>
       </body>
    </html>
           """
    println(html)
}