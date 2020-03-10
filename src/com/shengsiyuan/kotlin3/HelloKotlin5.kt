package com.shengsiyuan.kotlin3

/**
@author JiangBin
@create 2020-03-10 19:41 */

class OuterClass5 {

    inner class InnerClass5(str: String) {
        init {
            println(str)
        }
    }

}

fun main() {
    val innerClass5 : OuterClass5.InnerClass5 = OuterClass5().InnerClass5("Hello World")
}