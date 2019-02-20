package com.game98.kotlin.demo

open class BaseClass {
    open fun method() {
    }
}

abstract  class  ChildClass : BaseClass() {
    abstract override fun method()
}

class  ChildNewClass : ChildClass() {
    override fun method() {
        println("ChildNewClass !")
    }
}

fun main() {
    val  child3 = ChildNewClass()
    child3.method()
}