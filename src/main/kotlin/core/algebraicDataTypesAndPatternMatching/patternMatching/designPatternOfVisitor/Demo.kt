package core.algebraicDataTypesAndPatternMatching.patternMatching.designPatternOfVisitor

/**
 * Created by ChenJinXin on 2021/6/28 下午4:38
 */
sealed class Expr0 {
    abstract fun accept(v: Visitor0): Boolean
    class Num(val value: Int) : Expr0() {
        override fun accept(v: Visitor0): Boolean = v.visit(this)
    }

    class Operate(val opName: String, val left: Expr0, val right: Expr0) : Expr0() {
        override fun accept(v: Visitor0): Boolean = v.visit(this)
    }
}

class Visitor0 {
    fun visit(expr: Expr0.Num): Boolean = false
    fun visit(expr: Expr0.Operate): Boolean = when (expr) {
        Expr0.Operate("+", Expr0.Num(0), expr.right) -> true
        Expr0.Operate("+", expr.left, Expr0.Num(0)) -> true
        else -> false
    }
}