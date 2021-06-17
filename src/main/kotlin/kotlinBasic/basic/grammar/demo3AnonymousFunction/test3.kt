package kotlinBasic.basic.grammar.demo3AnonymousFunction

import kotlinBasic.basic.grammar.demo1.Country
import kotlinBasic.basic.grammar.demo1.CountryApp

/**
 * Created by chenjinxin on 2021/6/11 下午3:24
 */
fun main() {

    val countryApp = CountryApp()
    val countries = listOf<Country>()
    countryApp.filterCountries(countries, fun(country: Country): Boolean {
        return country.continient == "EU" && country.population > 10000
    })
}