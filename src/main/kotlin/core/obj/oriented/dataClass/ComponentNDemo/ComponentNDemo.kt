package core.obj.oriented.dataClass.ComponentNDemo

import core.obj.oriented.dataClass.copyDemo.Bird

/**
 * Created by chenjinxin on 2021/6/25 下午3:16
 */
// componentN可以理解为类属性的值，其中N代表属性的顺序，比如component1代表第1个属性的值，component3代表第3个属性的值。
fun test(){
    val b1 = Bird(20.0, 1, "blue")
    //通常方式
    val weight = b1.weight
    val age = b1.age
    val color = b1.color
    //Kotlin进阶
    val (weight2,age2,color2) = b1
    println("$weight, $age, $color")
    println("$weight2, $age2, $color2")
}

fun test2(){
    val birdInfo = "20.0,1,blue"
    //通常方式
    val infoList = birdInfo.split(",")
    val weight = infoList[0]
    val age = infoList[1]
    val color = infoList[2]
    //Kotlin进阶
    val (weight2,age2,color2) = birdInfo.split(",")
    println("$weight, $age, $color")
    println("$weight2, $age2, $color2")
}

fun main() {
    test()
    test2()
}