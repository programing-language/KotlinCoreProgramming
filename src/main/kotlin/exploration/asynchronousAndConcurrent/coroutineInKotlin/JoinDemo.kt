package exploration.asynchronousAndConcurrent.coroutineInKotlin

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/**
 * Created by ChenJinXin on 2021/7/21 下午4:24
 */

suspend fun search() {
    delay(1000L)
    println("World!")
}
fun main() = runBlocking {
    val job = launch {
        search()
    }
    println("Hello,")
    // 程序会一直等待，直到我们启动的协程结束。注意，这里的等待是非阻塞式的等待，不会将当前线程挂起。
    job.join()
}