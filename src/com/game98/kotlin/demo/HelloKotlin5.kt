package com.game98.kotlin.demo

fun main(args: Array<String>) {

    println(convert2UpperCase("hello"))

}

fun convert2UpperCase(str: Any): String?{

    if(str is String) {
        return str.toUpperCase()
    }
    return null
}