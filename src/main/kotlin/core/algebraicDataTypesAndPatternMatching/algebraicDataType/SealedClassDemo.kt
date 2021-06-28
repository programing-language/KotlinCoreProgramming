package core.algebraicDataTypesAndPatternMatching.algebraicDataType

/**
 * Created by ChenJinXin on 2021/6/28 下午2:35
 */

fun fishing(): Unit = Unit
fun work(): Unit = Unit
fun study(): Unit = Unit
fun library(): Unit = Unit
fun writing(): Unit = Unit
fun appointment(): Unit = Unit
fun basketball(): Unit = Unit

sealed class Day {
    class SUN : Day()
    class MON : Day()
    class TUE : Day()
    class WED : Day()
    class THU : Day()
    class FRI : Day()
    class SAT : Day()
}

// 因为和类型是类型安全的，我们只需要将可能的情况列出来即可。另外，如果我们遗漏了某种情况或者说多添加了额外的情况，编译器会报错的。
fun schedule(day: Day): Unit =
        when (day) {
            is Day.SUN -> fishing()
            is Day.MON -> work()
            is Day.TUE -> study()
            is Day.WED -> library()
            is Day.THU -> writing()
            is Day.FRI -> appointment()
            is Day.SAT -> basketball()
        }