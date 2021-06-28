package core.algebraicDataTypesAndPatternMatching.patternMatching

import core.algebraicDataTypesAndPatternMatching.algebraicDataType.case1.Shape

/**
 * Created by ChenJinXin on 2021/6/28 下午3:09
 */
//类型模式其实类似于我们在Java中使用的 istanceof 方法
fun gatArea(shape: Shape): Double = when (shape) {
    is Shape.Circle -> Math.PI * shape.radius * shape.radius
    is Shape.Rectangle -> shape.width * shape.height
    is Shape.Triangle -> shape.base * shape.height / 2.0
}

fun main() {
    val shape = Shape.Rectangle(10.0, 0.5)
    println(gatArea(shape))
}