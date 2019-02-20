package com.game98.kotlin.demo

import java.util.function.Consumer

fun main(args: Array<String>) {

    var list: List<String> = listOf("Hello", "World", "Hello World!" )

    for (str in list) {
        println(str)
    }

    println("-----------------------")

    list.forEach(Consumer { println(it) })

    println("------------------------")

    list.forEach ( System.out::println )

}