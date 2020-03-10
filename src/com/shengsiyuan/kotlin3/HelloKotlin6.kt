package com.shengsiyuan.kotlin3

/**
@author JiangBin
@create 2020-03-10 19:45 */


/**
 * 这个是Kotlin提供的一个特别重要的一个特性，在Android kotlin的开发中会大量使用它，所以需要好好学习，先来看一下对象表达式是啥？
 * Java当中匿名内部类在很多场景下都得到了大量使用，Kotlin的对象表达式就是为了解决匿名内部类的一些缺陷而产生的。先来回顾一下在Java中匿名内部类的特点：
1、匿名内部类是没有名字的类。
2、匿名的内部类一定是继承了某个父类，或是实现了某个接口。
3、Java运行时会将该匿名内部类当做它所实现的接口或是所继承的父类来看待。
 */

/**
对象表达式的格式
object[:若干个父类型，中间用逗号分隔]{}
 */

interface MyInterface {
    fun myPrint(i: Int)
}

abstract class MyAbstractClass {
    abstract val age: Int
    abstract fun printMyAbstractClassInfo()
}

fun main() {
    var myObject = object : MyInterface {
        override fun myPrint(i: Int) {
            println("i的值是$i")
        }
    }
    myObject.myPrint(100)

    println("----------------")

    //在Kotlin匿名内部类是可以不去实现任何接口的
    var myObject2 = object {
        init {
            println("初始化块执行")
        }
        var myProperty = "hello world"

        fun myMethod() = "myMethod()"

    }

    println(myObject2.myProperty)
    println(myObject2.myMethod())

    println("----------------------")

    //在Java的匿名内部类一定是继承了某个父类，或是实现了某个接口，不可能既实现某个接口又继承某个父类
    var myObject3 = object : MyInterface, MyAbstractClass() {

        override fun myPrint(i: Int) {
            println("i的值是$i")
        }

        override val age: Int
            get() = 30

        override fun printMyAbstractClassInfo() {
            println("printMyAbstractClassInfo invoked")
        }
    }

    myObject3.myPrint(100)
    println(myObject3.age)
    myObject3.printMyAbstractClassInfo()
}