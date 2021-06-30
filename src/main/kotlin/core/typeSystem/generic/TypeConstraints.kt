package core.typeSystem.generic

/**
 * Created by ChenJinXin on 2021/6/30 上午11:37
 */
class Plate<T>(val t: T)

open class Fruit(val weight: Double)

class Apple(weight: Double) : Fruit(weight)
class Banana(weight: Double) : Fruit(weight)

class FruitPlate<T : Fruit>(val t: T)

class Noodles(weight: Double)

val applePlate = FruitPlate<Apple>(Apple((100.0)))
val applePlate2 = FruitPlate(Apple(100.1))

//val noodlesPlate = FruitPlate<Noodles>(Noodles(200.0))//Type argument is not within its bounds.

interface Ground {}

class Watermelon(weight: Double) : Fruit(weight), Ground

fun <T> cut(t:T) where T:Fruit, T:Ground{
    println("You can cut me.")
}

fun main() {
    cut(Watermelon(3.0))
    //cut(Apple(2.0))
}
class TypeConstraints {

}