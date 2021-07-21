package exploration.asynchronousAndConcurrent.coroutineInKotlin

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

/**
 * Created by ChenJinXin on 2021/7/21 下午4:29
 */
suspend fun searchItemlOne(): String {
    delay(1000L)
    return "item-one"
}

suspend fun searchItemTwo(): String {
    delay(1000L)
    return "item-two"
}

fun asyncTest() = runBlocking<Unit> {
    val time = measureTimeMillis {
        val one = searchItemlOne()
        val two = searchItemTwo()
        println("asyncTest: The items is $one and $two")
    }
    println("Cost time is $time ms")
}

fun asyncTest2() = runBlocking<Unit> {
    val time = measureTimeMillis {
        val one = async { searchItemlOne() }
        val two = async { searchItemTwo() }
        println("asyncTest2: The items is ${one.await()} and ${two.await()}")
    }
    println("Cost time is $time ms")
}

fun main(args: Array<String>) = runBlocking<Unit> {
    asyncTest()
    asyncTest2()
}