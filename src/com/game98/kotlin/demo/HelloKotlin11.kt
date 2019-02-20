package com.game98.kotlin.demo


//在Kotlin中，一个类可以有一个primary构造方法及一个或多个secondary构造方法

//primary构造方法是类头（class header）的一部分，它位于类名后面，可以游泳若干个参数

//如果primary构造方法没有任何注解是可见性关键字修饰，那么constructor关键词可省略
class  MyClass constructor(username:String) {
    private  val username: String = username.toUpperCase()

    init {
        println(username)
    }
}

fun main(args: Array<String>) {
    var myClass = MyClass("zhangsan")
}