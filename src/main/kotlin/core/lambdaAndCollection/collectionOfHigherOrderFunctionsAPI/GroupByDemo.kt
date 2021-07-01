package core.lambdaAndCollection.collectionOfHigherOrderFunctionsAPI

/**
 * Created by ChenJinXin on 2021/7/1 下午4:27
 */
fun test6(){
    val groupBySex = students.groupBy { it.sex }
    println(groupBySex)
    //{m=[Student(name=Jilen, age=30, sex=m, score=85), Student(name=Shaw, age=18, sex=m, score=90), Student(name=Jack, age=30, sex=m, score=70)], f=[Student(name=Yison, age=40, sex=f, score=59), Student(name=Lisa, age=25, sex=f, score=88), Student(name=Pan, age=36, sex=f, score=55)]}
}

fun main() {
    test6()
}