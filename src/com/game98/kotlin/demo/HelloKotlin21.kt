package com.game98.kotlin.demo

/**
 *
 * 延迟初始化属性
 *
 * Kotlin要求非空类型的属性必须要在构造方法中进行初始化
 * 有时，这种要求不太方便，比如可以通过依赖注入或单元测试情况下进行赋值
 *
 * 通过lateinit关键字标示属于属性为延迟初始化，需要满足如下3个条件
 *1、，不能用在primary constructor
 *2、属性不能有自定义的setter 和 getter 方法
 *3、属性类型非空lateinit只能用在类体申明的var属性上并且不能是原生数据类型
 */
class TheClass {

    lateinit var name : String


    fun init() {
        this.name = "zhangsan"
    }

    fun  printInfo() {
        println(this.name)
    }

}

fun main() {
    val the = TheClass()
    the.init()
    the.printInfo()
}