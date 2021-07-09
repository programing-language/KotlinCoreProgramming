package exploration.designPatterns.behavioral.chainOfResponsibilityModel

/**
 * Created by ChenJinXin on 2021/7/9 上午10:12
 */
data class ApplyEvent(val money: Int, val title: String)

interface ApplyHandler {
    val successor: ApplyHandler?
    fun handleEvent(event: ApplyEvent)
}

class GroupLeader(override val successor: ApplyHandler?) : ApplyHandler {
    override fun handleEvent(event: ApplyEvent) {
        when {
            event.money <= 100 -> println("Group Leader handled application: ${event.title}")
            else -> when (successor) {
                is ApplyHandler -> successor.handleEvent(event)
                else -> println("Group Leader: This application cannot be handle")
            }
        }
    }
}

class President(override val successor: ApplyHandler?) : ApplyHandler {
    override fun handleEvent(event: ApplyEvent) {
        when {
            event.money <= 500 -> println("President handled application: ${event.title}")
            else -> when (successor) {
                is ApplyHandler -> successor.handleEvent(event)
                else -> println("President: This application cannot be handle")
            }
        }
    }
}

class College(override val successor: ApplyHandler?) : ApplyHandler {
    override fun handleEvent(event: ApplyEvent) {
        when {
            event.money > 1000 -> println("College: This application is refused.")
            else -> println("College handled application: ${event.title}.")
        }
    }
}

fun main() {
    val college = College(null)
    val president = President(college)
    val groupLeader = GroupLeader(president)

    groupLeader.handleEvent(ApplyEvent(10,"bug a pen"))
    groupLeader.handleEvent(ApplyEvent(200,"team building"))
    groupLeader.handleEvent(ApplyEvent(600,"hold a debate match"))
    groupLeader.handleEvent(ApplyEvent(1200,"annual meeting of the college"))
}