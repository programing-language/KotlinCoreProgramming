package core.obj.oriented.cls.inter

/**
 * Created by chenjinxin on 2021/6/18 下午1:43
 */
class Bird9(val wight: Double, val age: Int, val color: String) {
    // 总结by lazy语法的特点如下：
    //·该变量必须是引用不可变的，而不能通过var来声明。
    //·在被首次调用时，才会进行赋值操作。一旦被赋值，后续它将不能被更改。
    /*val sex: String by lazy {
        if (color == "yellow") "male" else "female"
    }*/

    // lazy的背后是接受一个lambda并返回一个Lazy<T>实例的函数，第一次访问该属性时，会执行lazy对应的Lambda表达式并记录结果，后续访问该属性时只是返回记录的结果。
    //另外系统会给lazy属性默认加上同步锁，也就是LazyThreadSafetyMode.SYNCHRON IZED，它在同一时刻只允许一个线程对lazy属性进行初始化，所以它是线程安全的。
    // 但若你能确认该属性可以并行执行，没有线程安全问题，那么可以给lazy传递LazyThreadSafetyMode.PUBLICATION参数。
    // 你还可以给lazy传递LazyThreadSafetyMode.NONE参数，这将不会有任何线程方面的开销，当然也不会有任何线程安全的保证。比如：
    /*val sex:String by lazy(LazyThreadSafetyMode.PUBLICATION){
        // 并行模式
        if (color == "yellow") "male" else "female"
    }*/

    val sex:String by lazy(LazyThreadSafetyMode.NONE){
        // 不做任何线程保证，也不会有任何线程开销
        if (color == "yellow") "male" else "female"
    }
}