package com.game98.kotlin.demo

fun main() {

    var i :Int
    for (i in 2..100) {

        if(i%2==0||i%3==0||i%5==0||i%7==0||i%11==0) {
            continue
        }
        println(i)
    }

}