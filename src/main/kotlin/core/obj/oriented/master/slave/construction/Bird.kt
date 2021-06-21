package core.obj.oriented.master.slave.construction

import java.util.*

/**
 * Created by chenjinxin on 2021/6/18 下午3:19
 */
fun getAgeByBirth(birth: Date): Int {
    return 1
}

class Bird(age: Int) {
    val age: Int

    init {
        this.age = age
    }


    constructor(birth: Date) : this(getAgeByBirth(birth)) {

    }

}