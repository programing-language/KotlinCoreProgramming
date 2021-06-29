package core.typeSystem.nullableType

/**
 * Created by ChenJinXin on 2021/6/29 下午4:51
 */
sealed class Either<A, B> {
    class Left<A, B>(val value: A) : Either<A, B>()
    class Right<A, B>(val value: B) : Either<A, B>()
}

fun main() {
    fun getDegreeOfMyopiaKt1(seat: Seat?): Double {
        return seat?.student?.glasses?.degreeOfMyopia ?: throw NullPointerException("some reasons")
    }

    fun getDegreeOfMyopiaKt(seat: Seat?): Either<Error, Double> {
        return seat?.student?.glasses?.let { Either.Right<Error, Double>(it.degreeOfMyopia) }
                ?: Either.Left<Error, Double>(Error("-1"))
    }
}