package com.shengsiyuan.kotlin3

/**
@author JiangBin
@create 2020-03-10 19:37 */

class OuterClass4 {
    class NestedClass4 {
        init {
            println("NestedClass4 构造块执行")
        }
    }
}

fun main() {
    val nestedClass4 : OuterClass4.NestedClass4 = OuterClass4.NestedClass4()
}