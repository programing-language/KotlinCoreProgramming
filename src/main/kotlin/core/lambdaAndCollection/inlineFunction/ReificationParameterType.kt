package core.lambdaAndCollection.inlineFunction

/**
 * Created by ChenJinXin on 2021/7/2 上午10:08
 */
fun main() {
    getType<Int>()
}

inline fun <reified T> getType(){
    println(T::class)
}