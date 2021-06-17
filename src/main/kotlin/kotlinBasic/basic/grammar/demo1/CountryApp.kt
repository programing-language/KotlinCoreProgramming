package kotlinBasic.basic.grammar.demo1

/**
 * Created by chenjinxin on 2021/6/11 下午2:36
 */
class CountryApp {
    fun filterCountries(countries: List<Country>): List<Country> {
        val res = mutableListOf<Country>()
        for (c in countries) {
            if (c.continient == "EU") {// EU代表欧洲
                res.add(c)
            }
        }
        return res
    }

    fun filterCountries(countries: List<Country>, continient: String): List<Country> {
        val res = mutableListOf<Country>()
        for (c in countries) {
            if (c.continient == continient) {
                res.add(c)
            }
        }
        return res
    }

    fun filterCountries(countries: List<Country>, continient: String, population: Int): List<Country> {
        val res = mutableListOf<Country>()
        for (c in countries) {
            if (c.continient == continient && c.population > population) {
                res.add(c)
            }
        }
        return res
    }

    fun filterCountries(
            countries: List<Country>,
            test: (Country) -> Boolean// 增加了一个函数类型的参数test
    ): List<Country> {
        val res = mutableListOf<Country>()
        for (c in countries) {
            if (test(c)) {// 直接调用test来进行筛选
                res.add(c)
            }
        }
        return res
    }

}