package exploration.designPatterns.creation.builderMode

/**
 * Created by ChenJinXin on 2021/7/8 下午3:35
 */
class Robot2(
        val code: String,
        val battery: String? = null,
        val height: Int? = null,
        val weight: Int? = null
)

fun main() {
    val robot1 = Robot2(code = "007")
    val robot2 = Robot2(code = "007", battery = "R6")
    val robot3 = Robot2(code = "007", height = 100, weight = 80)
}