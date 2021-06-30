package core.typeSystem.generic

/**
 * Created by ChenJinXin on 2021/6/30 上午10:56
 */
class SmartList<T> : ArrayList<T>() {
    fun find(t: T): T? {
        val index = super.indexOf(t)
        return if (index >= 0) super.get(index) else null
    }
}

fun main() {
    val smartList = SmartList<String>()
    smartList.add("one")
    println(smartList.find("one"))//输出 one
    println(smartList.find("two").isNullOrEmpty())//输出true
}