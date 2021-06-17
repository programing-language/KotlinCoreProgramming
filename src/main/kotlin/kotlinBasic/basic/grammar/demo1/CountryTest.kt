package kotlinBasic.basic.grammar.demo1

/**
 * Created by chenjinxin on 2021/6/11 下午2:42
 */
class CountryTest {
    fun isBigEuropeanCountry(country: Country): Boolean {
        return country.continient == "EU" && country.population > 10000
    }
}