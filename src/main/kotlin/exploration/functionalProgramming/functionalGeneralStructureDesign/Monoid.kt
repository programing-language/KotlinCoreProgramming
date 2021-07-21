package exploration.functionalProgramming.functionalGeneralStructureDesign

import core.algebraicDataTypesAndPatternMatching.algebraicDataType.b
import exploration.functionalProgramming.implementTypeclass.ListFoldable

/**
 * Created by ChenJinXin on 2021/7/21 下午3:26
 */
interface Monoid<A> {
    fun zero(): A
    fun A.append(b: A): A
}

object StringConcatMonoid : Monoid<String> {
    override fun zero(): String {
        return ""
    }

    override fun String.append(b: String): String {
        return this + b
    }
}

/*
fun <A> List<A>.sum(ma: Monoid<A>): A {
    val fa = this
    return ListFoldable.run {
        fa.fold(ma.zero())({ s, i ->
            ma.run {
                s.append(i)
            }
        })
    }
}*/
