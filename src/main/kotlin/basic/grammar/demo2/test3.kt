package basic.grammar.demo2

import basic.grammar.demo1.Country
import basic.grammar.demo1.CountryApp
import basic.grammar.demo1.CountryTest

/**
 * Created by chenjinxin on 2021/6/11 下午3:24
 */
fun main() {
    val countryApp = CountryApp()
    val countryTest = CountryTest()
    val countries = listOf<Country>()
    countryApp.filterCountries(countries, countryTest::isBigEuropeanCountry)
}