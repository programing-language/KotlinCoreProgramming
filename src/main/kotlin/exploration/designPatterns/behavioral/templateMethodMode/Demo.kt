package exploration.designPatterns.behavioral.templateMethodMode

/**
 * Created by ChenJinXin on 2021/7/8 下午5:59
 */
abstract class CivicCenterTask {
    fun execute() {
        this.lineUp()
        this.askForHelp()
        this.evaluate()
    }

    private fun lineUp() {
        println("line up to take a number")
    }

    private fun evaluate() {
        println("evaluate service attitude")
    }

    abstract fun askForHelp()
}

class PullSocialSecurity : CivicCenterTask() {
    override fun askForHelp() {
        println("ask for pulling the social security")
    }
}

class ApplyForCitizenCard : CivicCenterTask() {
    override fun askForHelp() {
        println("apply for a citizen card")
    }
}

fun main() {
    val pss = PullSocialSecurity()
    pss.execute()

    val afcc = ApplyForCitizenCard()
    afcc.execute()
}