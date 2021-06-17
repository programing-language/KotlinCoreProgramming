package kotlinBasic.basic.grammar.demo4Lambda

import kotlinBasic.basic.grammar.demo1.Country
import kotlinBasic.basic.grammar.demo1.CountryApp

/**
 * Created by chenjinxin on 2021/6/11 下午3:24
 */
fun main() {

    val countryApp = CountryApp()
    val countries = listOf<Country>()
    countryApp.filterCountries(countries) { country ->
        country.continient == "EU" && country.population > 10000
    }
}