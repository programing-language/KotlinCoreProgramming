package core.lambdaAndCollection.lazyCollection

import core.lambdaAndCollection.collectionOfHigherOrderFunctionsAPI.Student
import core.lambdaAndCollection.collectionOfHigherOrderFunctionsAPI.students
import java.util.stream.Collectors.toList
import java.util.stream.Stream


/**
 * Created by ChenJinXin on 2021/7/1 下午5:54
 */
fun main() {
    //Java 8的流和Kotlin中的序列一样，也是惰性求值的，这就意味着Java 8的流也是存在中间操作和末端操作的（事实也确实如此），所以必须通过上面的一系列转换才行。
    val list = students.stream().filter { it -> it.sex == "m" }.collect(toList())
    println(list)

    val studentsStream: Stream<Student> = students.stream()
    studentsStream.filter({ it -> it.sex === "m" }).collect(toList())
    // 你不能再继续在studentsStream上进行这种遍历操作，否则会报错
    // 和迭代器很相似，当你遍历完成之后，这个流就相当于被消费掉了，你必须再创建一个新的Stream才能再遍历一次。
    // studentsStream.filter { (_, _, sex) -> sex === "f" }.collect(toList()) //stream has already been operated upon or closed

    //Stream能够并行处理数据
    //并行处理数据这一特性是Kotlin的序列目前还没有实现的地方，如果我们需要用到处理多线程的集合还需要依赖Java。
    val list2 = students.parallelStream().filter { it -> it.sex == "m" }.collect(toList())
    println(list2)
}