package exploration.functionalProgramming.functionalProgrammingtypeInsteadOfExceptionHandlingError

import exploration.functionalProgramming.implementTypeclass.Kind

/**
 * Created by ChenJinXin on 2021/7/21 下午3:44
 */
@Suppress("UNCHECKED_CAST", "NOTHING_TO_INLINE")
inline fun <A> Kind<Option.K, A>.unwrap(): Option<A> =
        this as Option<A>


sealed class Option<out A> : Kind<Option.K, A> {
    object K
}

data class Some<V>(val value: V) : Option<V>()
object None : Option<Nothing>()

