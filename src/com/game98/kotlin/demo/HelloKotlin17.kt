package com.game98.kotlin.demo

interface A {
    fun  method () {
        println("A")
    }
}

open class  B {
    open  fun method() {

        println("B")
    }
}

class  C : A, B() {

//    override fun method() {
//        println("class method from class C")
//    }

    override fun method() {
        super<A>.method()
        super<B>.method()
    }
}

fun main() {
    val  c  = C()
    c.method()
}