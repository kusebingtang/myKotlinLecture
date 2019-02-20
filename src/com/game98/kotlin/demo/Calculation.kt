package com.game98.kotlin.demo

fun main(args: Array<String>) {

    val array:IntArray = intArrayOf(1,2,3,4,5)

    for (item in array)
    {
        println(item)
    }


    println("----------------------------")

    for (index in array.indices){
        println("array[$index] = ${array[index]}")
    }

    println("----------------------------")


    for ((index,value) in array.withIndex()) {
        println("array[$index] = $value")
    }


}

