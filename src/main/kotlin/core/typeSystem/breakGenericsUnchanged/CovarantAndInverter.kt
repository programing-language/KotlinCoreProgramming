package core.typeSystem.breakGenericsUnchanged

import java.lang.IndexOutOfBoundsException

/**
 * Created by ChenJinXin on 2021/6/30 下午3:37
 */
fun <T> copy(dest: Array<T>, src: Array<T>) {
    if (dest.size < src.size) {
        throw IndexOutOfBoundsException()
    } else {
        src.forEachIndexed { index, value -> dest[index] = src[index] }
    }
}

//in版本，T是Double类型，所以dest可以接收Double类型的父类型Array，比如Array<Number>
fun <T> copyIn(dest: Array<in T>, src: Array<T>) {
    if (dest.size < src.size) {
        throw IndexOutOfBoundsException()
    } else {
        src.forEachIndexed { index, value -> dest[index] = src[index] }
    }
}

//out版本，T是Number类型，所以src可以接收Number类型的子类型Array，比如Array<Double>
fun <T> copyOut(dest: Array<T>, src: Array<out T>) {
    if (dest.size < src.size) {
        throw IndexOutOfBoundsException()
    } else {
        src.forEachIndexed { index, value -> dest[index] = src[index] }
    }
}

fun main() {
    var descDouble = arrayOfNulls<Double>(3)
    val srcDouble = arrayOf<Double?>(1.0, 2.0, 3.0)
    copy(descDouble, srcDouble)
    println(descDouble.toList())

    var destInt = arrayOfNulls<Int>(3)
    val srcInt = arrayOf<Int?>(1, 2, 3)
    copy(destInt, srcInt)
    println(destInt.toList())

    var dest = arrayOfNulls<Number>(3)
    val src = arrayOf<Double>(1.0, 2.0, 3.0)
    copyIn(dest, src)
    println(dest.toList())
    copyOut(dest, src)
    println(dest.toList())
}