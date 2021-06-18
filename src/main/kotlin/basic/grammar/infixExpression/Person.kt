package basic.grammar.infixExpression

/**
 * Created by chenjinxin on 2021/6/17 上午11:21
 */
class Person {
    infix fun called(name:String){
        println("My name is $name")
    }
}

fun main() {
    val p = Person()
    p called "cjx"
    p.called("chen")
}