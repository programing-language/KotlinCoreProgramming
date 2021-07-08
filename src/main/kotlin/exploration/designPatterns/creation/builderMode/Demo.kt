package exploration.designPatterns.creation.builderMode

/**
 * Created by ChenJinXin on 2021/7/8 下午2:50
 */
class Robot private constructor(
        val code: String,
        val battery: String?,
        val height: Int?,
        val weight: Int?) {

    class Builder(val code: String) {
        private var battery: String? = null
        private var height: Int? = null
        private var weight: Int? = null

        fun setBattery(battery: String?): Builder {
            this.battery = battery
            return this
        }

        fun setHeight(height: Int?): Builder {
            this.height = height
            return this
        }

        fun setWeight(weight: Int?): Builder {
            this.weight = weight
            return this
        }

        fun build(): Robot {
            return Robot(code, battery, height, weight)
        }
    }
}

fun main() {
    val robot = Robot.Builder("007")
            .setBattery("R6")
            .setHeight(100)
            .setWeight(80)
            .build()
}