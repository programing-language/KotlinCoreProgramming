package core.typeSystem.breakGenericsUnchanged

/**
 * Created by ChenJinXin on 2021/6/30 下午3:26
 */
//支持协变的List只可以读取，而不可以添加。
val stringList: List<String> = ArrayList<String>()
val anyList: List<Any> = stringList