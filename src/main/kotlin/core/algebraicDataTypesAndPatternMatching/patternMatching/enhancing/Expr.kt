package core.algebraicDataTypesAndPatternMatching.patternMatching.enhancing

/**
 * Created by ChenJinXin on 2021/6/28 下午4:08
 */
sealed class Expr {
    abstract fun isZero(): Boolean
    abstract fun isAddZero(): Boolean
    abstract fun left(): Expr
    abstract fun right(): Expr

    data class Num(val value: Int) : Expr() {
        override fun isZero(): Boolean = this.value == 0
        override fun isAddZero(): Boolean = false
        override fun left(): Expr = throw Throwable("no element")
        override fun right(): Expr = throw Throwable("no element")
    }

    data class Operate(val opName: String, val left: Expr, val right: Expr) : Expr() {
        override fun isZero(): Boolean = false
        override fun isAddZero(): Boolean = this.opName == "+" && (this.left.isZero() || this.right.isZero())
        override fun left(): Expr = this.left
        override fun right(): Expr = this.right
    }
}

val expr = Expr.Operate("+", Expr.Num(0), Expr.Operate("+", Expr.Num(0), Expr.Num(1)))

fun simplifyExpr(expr: Expr): Expr = when {
    expr.isAddZero() && expr.right().isAddZero() && expr.right().left().isZero() -> expr.right().right()
    else -> expr
}

fun main() {
    println(simplifyExpr(expr))
}
