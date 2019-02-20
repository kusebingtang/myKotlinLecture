package com.game98.kotlin.demo

class Person constructor(username:String) {

    private  var  username: String

    private  var  age: Int

    private  var  address : String

    init {
        println(username)

        this.username = username
        this.age = 20
        this.address = "beijing"
    }

    constructor(username: String, age: Int):this(username) {
        println("$username , $age")

        this.age = age
        this.address = "beijing"
    }

    constructor(username: String, age: Int, address:String):this(username,age) {
        this.address = address
    }

    fun printInfo() {
        println("username : ${this.username}, age: ${this.age}, address: ${this.address}")
    }
}

fun main() {

    val person = Person("zhangsan")
    val person2 = Person("lisi",28)
    val  person3 = Person("wangwu",22,"tianjin")

    person.printInfo()
    person2.printInfo()
    person3.printInfo()

}