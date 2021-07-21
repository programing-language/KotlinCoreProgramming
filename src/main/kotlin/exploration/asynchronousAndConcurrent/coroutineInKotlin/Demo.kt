package exploration.asynchronousAndConcurrent.coroutineInKotlin

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/**
 * Created by ChenJinXin on 2021/7/21 下午3:58
 */
fun test1() {
    GlobalScope.launch {  // 在后台启动一个协程
        delay(1000L)      // 延迟1秒(非阻塞)
        println("World!") // 延迟之后输出
    }
    println("Hello,")     // 协程被延迟了1秒，但是主线程继续执行
    Thread.sleep(2000L)   // 为了使JVM保活，阻塞主线程2秒钟(若将这段代码删掉会出现什么情况？)
    //Hello,
    //World!
}

fun test2() {
    GlobalScope.launch {  // 在后台启动一个协程
        delay(1000L)      // 延迟1秒(非阻塞)
        println("World!") // 延迟之后输出
    }
    println("Hello,")     // 协程被延迟了1秒，但是主线程继续执行
    //Hello,
}

// 启动了10万个协程去执行了一个输出“Hello”的操作，当我们执行这段代码之后，“Hello”就会被陆续地打印出来。
// 但是，如果我们启动10万个线程去做的话，就可能会出现“out of memory”的错误了。
fun test3() = runBlocking {
    repeat(100_000) {
        launch {
            println("Hello")
        }
    }
}

fun main(args: Array<String>) {
//    test1()
//    test2()
    test3()
}