package com.game98.kotlin.demo


/**
 * var propertyName = propertyType = initializer
 *      getter()......
 *      setter()......
 *
 *
 *  backing field 支撑字段(域)
 *  backing property，支撑属性
 */
class ThePersion(address: String,name: String) {

    val age: Int
        get() = 20

    var address: String = address
        get() {
            println("getter invoked")
            return  field
        }
        set(value) {
            println("setter invoked")
            field = value
        }
    var name: String = name;

}


fun main() {
    val persion = ThePersion("beijing","zhangsan")

    println(persion.age)

    println(persion.address)
    persion.address = "tianjing"
    println(persion.address)

    println(persion.name)
    persion.name = "lisi"
    println(persion.name)

}