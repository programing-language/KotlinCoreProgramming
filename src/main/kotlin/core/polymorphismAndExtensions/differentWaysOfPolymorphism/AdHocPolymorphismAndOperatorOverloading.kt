package core.polymorphismAndExtensions.differentWaysOfPolymorphism

/**
 * Created by ChenJinXin on 2021/7/5 下午5:32
 */
interface SumAble<T> {
    fun plusThat(that: T): T
}

data class Len(val v: Int) : SumAble<Len> {
    override fun plusThat(that: Len) = Len(this.v + that.v)
}


data class Area(val value: Double)

operator fun Area.plus(that: Area): Area {
    return Area(this.value + that.value)
}

fun main() {
    println(Area(1.0) + Area(2.0))// 运行结果：Area(value=3.0)
}