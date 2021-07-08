package core.metaprogramming.kotlinAnnotation

/**
 * Created by ChenJinXin on 2021/7/8 上午11:23
 */
annotation class Cache(val namespace: String, val expires: Int)
annotation class CacheKey(val keyName: String, val buckets: IntArray)

@Cache(namespace = "hero", expires = 3600)
data class Hero(
        @property:CacheKey(keyName = "heroName", buckets = intArrayOf(1, 2, 3))
        val name: String,
        @field:CacheKey(keyName = "heroName", buckets = intArrayOf(1, 2, 3))
        val attack: Int,
        @get:CacheKey(keyName = "heroName", buckets = intArrayOf(1, 2, 3))
        val defense: Int,
        val initHp: Int
)

fun main() {
    val cacheAnnotion = Hero::class.annotations.find { it is Cache } as Cache?
    println("namespace ${cacheAnnotion?.namespace}")
    println("expires ${cacheAnnotion?.expires}")
}