package exploration.designPatterns.creation.builderMode

/**
 * Created by ChenJinXin on 2021/7/8 下午3:41
 */
class Robot3(
        val code: String,
        val battery: String? = null,
        val height: Int? = null,
        val weight: Int? = null
) {
    init {
        require(weight == null || battery != null) {
            "Battery should be determined when setting weight."
        }
    }
}

fun main() {
    val robot = Robot3(code = "007", weight = 100)
}