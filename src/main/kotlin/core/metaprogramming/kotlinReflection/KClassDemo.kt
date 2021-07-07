package core.metaprogramming.kotlinReflection

import kotlin.reflect.full.*

/**
 * Created by ChenJinXin on 2021/7/7 下午5:26
 */
data class Succ<N : Nat>(val prev: N) : Nat()

sealed class Nat {
    companion object {
        object Zero : Nat()
    }

    val Companion._0
        get() = Zero

    fun <A : Nat> Succ<A>.preceed(): A {
        return this.prev
    }
}

fun <A : Nat> Nat.plus(other: A): Nat = when {
    other is Succ<*> -> Succ(this.plus(other.prev))// a + S(b) = S(a + b)
    else -> this
}

fun main() {
    println(Nat.Companion::class.isCompanion)
    println(Nat::class.isSealed)
    println(Nat.Companion::class.objectInstance)
    println(Nat::class.companionObjectInstance)
    println(Nat::class.declaredMemberExtensionProperties.map { it.name })
    println(Nat::class.declaredMemberExtensionFunctions.map { it.name })
    println(Succ::class.memberExtensionFunctions.map { it.name })
    println(Succ::class.declaredMemberExtensionProperties)
    println(Succ::class.declaredMemberExtensionProperties.map { it.name })
    println(Succ::class.memberExtensionProperties.map { it.name })
    println(Succ::class.starProjectedType)
    //true
    //true
    //core.metaprogramming.kotlinReflection.Nat$Companion@6e2c9341
    //core.metaprogramming.kotlinReflection.Nat$Companion@6e2c9341
    //[_0]
    //[]
    //[preceed]
    //[val core.metaprogramming.kotlinReflection.Nat.(core.metaprogramming.kotlinReflection.Nat.Companion.)_0: core.metaprogramming.kotlinReflection.Nat.Companion.Zero]
    //[]
    //[_0]
    //core.metaprogramming.kotlinReflection.Succ<*>
}

