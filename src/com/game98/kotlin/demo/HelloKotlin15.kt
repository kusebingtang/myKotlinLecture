package com.game98.kotlin.demo

open class  Fruit {
    open fun name () {
        println("fruit")
    }

    fun expirationDate() {
        println("1 month")
    }
}

class  Apple : Fruit() {
    override fun name () {
        println("Apple")
    }
}


fun main() {
    val  apple = Apple();

    apple.name();
    apple.expirationDate()
}