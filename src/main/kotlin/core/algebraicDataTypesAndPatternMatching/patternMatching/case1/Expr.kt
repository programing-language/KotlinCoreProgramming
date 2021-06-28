package core.algebraicDataTypesAndPatternMatching.patternMatching.case1

/**
 * Created by ChenJinXin on 2021/6/28 下午3:22
 */
sealed class Expr {
    data class Num(val value: Int) : Expr()
    data class Operate(val opName: String, val left: Expr, val right: Expr) : Expr()
}