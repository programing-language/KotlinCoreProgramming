package core.typeSystem.generic

/**
 * Created by ChenJinXin on 2021/6/30 下午2:14
 */
class TypeErasure {

}

open class Plate2<T>(val t:T,val clazz: Class<T>){
    fun getType(){
        println(clazz)
    }
}

fun main() {
    val appleList = ArrayList<Apple>()
    println(appleList.javaClass)

    val applePlate = Plate2(Apple(1.0),Apple::class.java)
    applePlate.getType()

    // 利用匿名内部类获取各种类型的信息
    val list1 = ArrayList<String>()
    val list2 = object :ArrayList<String>(){} //匿名内部类
    println(list1.javaClass.genericSuperclass)
    println(list2.javaClass.genericSuperclass)

}
