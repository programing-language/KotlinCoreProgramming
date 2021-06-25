package core.obj.oriented.dataClass.pairAndTriple

/**
 * Created by chenjinxin on 2021/6/25 下午3:40
 */
fun main() {
    val pair = Pair(20.0, 1)
    val triple = Triple(20.0, 1, "blue")

    //利用属性顺序获取值
    val weightP = pair.first
    val ageP = pair.second

    val weightT = triple.first
    val ageT = triple.second
    val colorT = triple.third

    //利用结构
    val (weightP2, ageP2) = pair
    val (weightT2, ageT2, colorT2) = triple

    println("$weightP, $ageP")
    println("$weightP2, $ageP2")
    println("$weightT, $ageT, $colorT")
    println("$weightT2, $ageT2, $colorT2")
}