package com.game98.kotlin.demo

fun main(args: Array<String>) {

    println(myPrint("hello"))

    println(myPrint2("world"))

}

fun myPrint(str:String):String {
    return when (str) {
        "hello" -> "HELLO"
        "world" -> "WORLD"
        "hello world" -> "HELLO WORLD"
        else -> "OTHER"
    }

}


fun myPrint2(str:String):String =
        when(str) {
            "hello" -> "HELLO"
            "world" -> "WORLD"
            "hello world" -> "HELLO WORLD"
            else -> "OTHER"
        }