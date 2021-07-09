package exploration.designPatterns.structural.decoratorMode

/**
 * Created by ChenJinXin on 2021/7/9 下午2:34
 */
class Printer{
    fun drawLine(){
        println("~~~~~~")
    }
    fun drawDottedLine(){
        println("------")
    }
    fun drawStarts(){
        println("******")
    }
}

fun Printer.startDraw(decorated:Printer.() -> Unit){
    println("+++ start drawing +++")
    this.decorated()
    println("+++ end drawing +++")
}

fun main() {
    Printer().run {
        startDraw {
            drawLine()
        }
        startDraw {
            drawDottedLine()
        }
        startDraw {
            drawStarts()
        }
    }
}