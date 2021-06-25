package core.obj.oriented.staticToObject.singletonObject

/**
 * Created by chenjinxin on 2021/6/25 下午4:17
 * 单例对象会在系统加载的时候初始化，当然全局就只有一个。
 */
object DatabaseConfig {
    var host: String = "127.0.0.1"
    var port: Int = 3306
    var username: String = "root"
    var password: String = ""
}

fun main() {
    DatabaseConfig.host = "localhost"
    DatabaseConfig.port = 8080
}