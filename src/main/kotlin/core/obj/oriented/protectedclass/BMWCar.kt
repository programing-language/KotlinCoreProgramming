package core.obj.oriented.protectedclass

/**
 * Created by chenjinxin on 2021/6/24 上午11:31
 */
class BMWCar(val name:String) {
    private val bMWEngine = Engine("BMW")
    /*fun getEngine():String{
        return bMWEngine.engineType()// error:Cannot access'enging Type'it is Protected in Engine
    }*/
}

// protected修饰符在Kotlin中的作用域只有类及子类。
private open class Engine(val type: String) {
    protected open fun engineType(): String {
        return "the engine type is $type"
    }
}

private class BZEngine(type: String):Engine(type){
    override fun engineType(): String {
        return super.engineType()
    }
}