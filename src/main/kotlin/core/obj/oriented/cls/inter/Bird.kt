package core.obj.oriented.cls.inter

/**
 * Created by chenjinxin on 2021/6/18 上午10:15
 */
class Bird {
    private val weight:Double = 500.0
    private val color:String = "blue"
    private val age:Int = 1
    fun fly(){}

    override fun toString(): String {
        return "Bird(weight=$weight, color='$color', age=$age)"
    }

}