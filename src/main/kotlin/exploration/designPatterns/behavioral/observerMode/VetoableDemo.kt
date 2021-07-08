package exploration.designPatterns.behavioral.observerMode

import kotlin.properties.Delegates

/**
 * Created by ChenJinXin on 2021/7/8 下午5:41
 */
var value: Int by Delegates.vetoable(0) { prop, old, new ->
    new > 0
}

fun main() {
    value = 1
    println(value)
    value = -1
    println(value)
}