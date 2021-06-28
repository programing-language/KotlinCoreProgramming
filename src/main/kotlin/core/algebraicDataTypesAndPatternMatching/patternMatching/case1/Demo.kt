package core.algebraicDataTypesAndPatternMatching.patternMatching.case1

/**
 * Created by ChenJinXin on 2021/6/28 下午3:24
 */
fun simplifyExpr(expr: Expr): Expr = when {
    (expr is Expr.Operate) && (expr.opName == "+") && (expr.left is Expr.Num) && (expr.left.value == 0) -> expr.right
    (expr is Expr.Operate) && (expr.opName == "+") && (expr.right is Expr.Num) && (expr.right.value == 0) -> expr.left
    else -> expr
}

fun simplifyExpr2(expr: Expr): Expr = when(expr) {
    is Expr.Num -> expr
    is Expr.Operate -> when(expr){
        Expr.Operate("+", Expr.Num(0), expr.right) -> expr.right
        Expr.Operate("+", expr.left, Expr.Num(0)) -> expr.left
        else -> expr
    }
}

//当嵌套的层数变多的时候，单纯使用when表达式还是显得无力。比如我们要匹配下面的结构：
//val expr = Expr.Operate("+", Expr.Num(0), Expr.Operate("+", Expr.Num(1), Expr.Num(0)))
//用Scala我们可以写出如下的模式来进行匹配：
//case Operate("+", Num(0), Operate("+", left, Num(0))) => left
//如果采用Kotlin，我们可以通过使用递归的方式实现：
fun simplifyExpr3(expr: Expr): Expr = when(expr) {
    is Expr.Num -> expr
    is Expr.Operate -> when(expr){
        Expr.Operate("+", Expr.Num(0), expr.right) -> simplifyExpr3(expr.right)
        Expr.Operate("+", expr.left, Expr.Num(0)) -> expr.left
        else -> expr
    }
}

//如果不用递归，采用Kotlin的when表达式我们只能这样去写：
fun simplifyExpr4(expr: Expr): Expr = when (expr) {
    is Expr.Num -> expr
    is Expr.Operate -> when {
        (expr.left is Expr.Num && expr.left.value == 0) && (expr.right is Expr.Operate) -> when (expr.right) {
        Expr.Operate("+", expr.right.left, Expr.Num(0)) -> expr.right.left
        else -> expr.right
    }
        else -> expr
    }
}