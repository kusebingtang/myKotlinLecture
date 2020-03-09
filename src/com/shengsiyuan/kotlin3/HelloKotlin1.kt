package com.shengsiyuan.kotlin3

/**
@author JiangBin
@create 2020-03-09 17:32 */

//嵌套类【Nested Class】：

class OuterClass {

    private val str: String = "Hello World"

    class NestedClass {

        fun nestedMethod() = "welcome"

    }

    class NestedClass2{
        val nestedClass = NestedClass()
    }

}

fun main() {
    println(OuterClass.NestedClass().nestedMethod())

    println(OuterClass.NestedClass2().nestedClass.nestedMethod())

}
