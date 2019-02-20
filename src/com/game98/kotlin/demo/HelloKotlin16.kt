package com.game98.kotlin.demo

open class  MyParent {
    open val name: String = "parent"
}

open  class  MyChild : MyParent() {
    override val name: String = "child"
}

fun main() {
    val  myChild = MyChild()
    println(myChild.name)


    println("---------------------")

    val child3 = MyChild3();
    child3.method()
    println(child3.name)
}


class  MyChild2(override val name: String) : MyParent() {

}

open class MyParent3 {

    open fun method() {
        println("method")
    }

    open val name: String get() = "MyParent3"
}

class  MyChild3 : MyParent3() {
    override fun method() {
        super.method()
        println("Child method")
    }

    open override val name :String get() = super.name+" and child"
}