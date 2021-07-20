package exploration.functionalProgramming.implementTypeclass

/**
 * Created by ChenJinXin on 2021/7/20 下午5:33
 */
fun main() {
    // 一阶值构造器：通过传入一个具体的值，然后构造出另一个具体的值。
    { x: (Int) -> Int ->
        x(1)
    }

    // 一阶类型构造器：通过传入一个具体的类型变量，然而构造出另一个具体的类型。
    { x: Int -> { y: Int -> x + y } }
}
