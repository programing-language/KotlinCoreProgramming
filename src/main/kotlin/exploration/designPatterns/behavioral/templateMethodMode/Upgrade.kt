package exploration.designPatterns.behavioral.templateMethodMode

/**
 * Created by ChenJinXin on 2021/7/8 下午6:05
 */
class CivicCenterTask2 {
    fun execute(askForHelp: () -> Unit) {
        this.lineUp()
        askForHelp()
        this.evaluate()
    }

    private fun lineUp() {
        println("line up to take a number")
    }

    private fun evaluate() {
        println("evaluate service attitude")
    }
}

fun pullSocialSecurity() {
    println("ask for pulling the social security")
}

fun applyForCitizenCard() {
    println("apply for a citizen card")
}

fun main() {
    val task = CivicCenterTask2()
    task.execute(::pullSocialSecurity)
    task.execute(::applyForCitizenCard)
}