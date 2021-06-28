package core.algebraicDataTypesAndPatternMatching.algebraicDataType.case1

/**
 * Created by ChenJinXin on 2021/6/28 下午2:46
 */
sealed class Shape {
    //圆形
    class Circle(val radius: Double) : Shape()

    //长方形
    class Rectangle(val width: Double, val height: Double) : Shape()

    //三角形
    class Triangle(val base: Double, val height: Double) : Shape()
}

fun gatArea(shape: Shape): Double = when (shape) {
    is Shape.Circle -> Math.PI * shape.radius * shape.radius
    is Shape.Rectangle -> shape.width * shape.height
    is Shape.Triangle -> shape.base * shape.height / 2.0
}

fun main() {
    val circle = Shape.Circle(1.0)
    println(gatArea(circle))
}