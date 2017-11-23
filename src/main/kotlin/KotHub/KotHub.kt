/**
 * Created by nickthompson on 11/22/17.
 */

package KotHub

import com.github.kittinunf.fuel.core.FuelManager
import com.github.kittinunf.fuel.httpGet

fun getGreeting(): String {
    val words = mutableListOf<String>()
    words.add("Hello,")
    words.add("world!")

    return words.joinToString(separator = " ")
}

fun main(args: Array<String>) {
    println(getGreeting())
    get()
}

fun get() {
    FuelManager.instance.basePath = "http://httpbin.org"
    "/get".httpGet().responseString { request, response, result ->
        //make a GET to http://httpbin.org/get and do something with response
        val (data, error) = result
        if (error == null) {
            //do something when success
            println(data)
        } else {
            //error handling
        }
    }
}