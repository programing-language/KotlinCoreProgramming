package core.obj.oriented.cls.inter

/**
 * Created by chenjinxin on 2021/6/18 上午11:08
 */
class Bird7(val weight: Double, val age: Int, val color: String) {
    val sex: String

    init {
        this.sex = if (this.color == "yellow") "male" else "female"
    }
}