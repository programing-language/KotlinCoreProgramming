package core.typeSystem.generic

/**
 * Created by ChenJinXin on 2021/6/30 上午11:01
 */
fun <T> ArrayList<T>.find(t: T): T? {
    val index = this.indexOf(t)
    return if (index >= 0) this[index] else null
}

fun main() {
    val arrayList = ArrayList<String>()
    arrayList.add("one")
    println(arrayList.find("one"))//输出 one
    println(arrayList.find("two").isNullOrEmpty())//输出true
}