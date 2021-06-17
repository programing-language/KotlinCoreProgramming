package kotlinBasic.basic.grammar.forIn

/**
 * Created by chenjinxin on 2021/6/17 上午10:59
 */
fun main() {
    for (i in 1..10) println(i)

    for (i: Int in 1..10) {
        println(i)
    }

    for (char in 'a'..'d') {
        println(char)
    }

    for (i in 1..10 step 2) println(i)

    for (i in 10 downTo 1 step 2) println(i)

    for (i in 1 until 10) println(i)

    println("a" in listOf("b", "c"))
    println("a" !in listOf("b", "c"))

    println("kot" in "abc" .. "xyz")

    val array = listOf<Int>(1,2,3,4,5,6)
    for (i in array){
        println(i)
    }
    for ((index, value) in array.withIndex()){
        println("$index -> $value")
    }
}
