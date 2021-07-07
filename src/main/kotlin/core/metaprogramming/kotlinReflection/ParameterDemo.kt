package core.metaprogramming.kotlinReflection

/**
 * Created by ChenJinXin on 2021/7/7 下午6:06
 */
fun KParameterShow() {
    val p = Person("疾跑", 8, "GuangZhou")
    for (c in Person::class.members) {
        print("${c.name} -> ")
        for (p in c.parameters) {
            print("${p.type} -- ")
        }
        println()
    }
}

fun test2(){
    Person::class.members.forEach {
        println("${it.name} -> ${it.returnType.classifier}")
    }
}

fun KTypeParameterShow(){
    for (c in Person::class.members){
        if (c.name.equals("get")){
            println(c.typeParameters)
        }
    }
    val list = listOf<String>("How")
    println(list::class.typeParameters)
}

fun main() {
//    KParameterShow()
//    test2()
    KTypeParameterShow()
}