package core.typeSystem.generic

/**
 * Created by ChenJinXin on 2021/6/30 下午3:18
 */
inline fun <reified T> getType(): Class<T> {
    return T::class.java
}