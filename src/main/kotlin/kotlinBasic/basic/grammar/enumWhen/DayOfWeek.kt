package kotlinBasic.basic.grammar.enumWhen

/**
 * Created by chenjinxin on 2021/6/17 上午10:43
 */
enum class DayOfWeek(private val day: Int) {
    MON(1),
    TUE(2),
    WEN(3),
    THU(4),
    FRI(5),
    SAT(6),
    SUN(7)
    ;  // 如果以下有额外的方法或属性定义，则必须强制加上分号

    fun getDayNumber(): Int {
        return day
    }
}