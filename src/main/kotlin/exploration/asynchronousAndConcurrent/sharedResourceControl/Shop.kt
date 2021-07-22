package exploration.asynchronousAndConcurrent.sharedResourceControl

import java.util.concurrent.locks.Lock
import java.util.concurrent.locks.ReentrantLock
import kotlin.concurrent.withLock

/**
 * Created by ChenJinXin on 2021/7/21 下午4:49
 */
class Shop2 {
    private val goods = hashMapOf<Long, Int>()

    init {
        goods[1] = 10
        goods[2] = 15
    }


    @Synchronized
    fun buyGoods(id: Long) {
        val stock = goods.getValue(id)
        goods[id] = stock - 1
    }

    fun buyGoods2(id: Long) {
        synchronized(this) {
            val stock = goods.getValue(id)
            goods.put(id, stock - 1)
        }
    }

    //这种写法似乎有如下不好之处：
    //·若是在同一个类内有多个同步方法，将会竞争同一把锁；
    //·在加锁之后，编码人员很容易忘记解锁操作；
    //·重复的模板代码。
    private var lock: Lock = ReentrantLock()
    fun buyGoods3(id: Long) {
        lock.lock()
        try {
            val stock = goods.getValue(id)
            goods.put(id, stock - 1)
        } catch (ex: Exception) {
            println("[Exception] is ${ex}")
        } finally {
            lock.unlock()
        }
    }

    //改进，提高 Lock 这个方式的抽象程度
    fun <T> withLock(lock: Lock, action: () -> T): T? {
        lock.lock()
        return try {
            action()
        } catch (ex: Exception) {
            println("[Exception] is $ex")
            null
        } finally {
            lock.unlock()
        }
    }

    fun buyGoods4(id: Long) {
        val stock = goods.getValue(id)
        goods[id] = stock - 1
    }

}

fun main() {
    val lock: Lock = ReentrantLock()

    Shop2().withLock(lock) { Shop2().buyGoods4(1) }

    //Kotlin在类库中提供了相应的方法。
    lock.withLock { Shop2().buyGoods4(1) }
}