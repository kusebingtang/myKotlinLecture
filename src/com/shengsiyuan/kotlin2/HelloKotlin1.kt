package com.shengsiyuan.kotlin2

data class Person(val name: String, var age: Int, var address: String)

data class Person2(val name: String = "", var age: Int = 20, var address: String = "beijing")

fun main(args: Array<String>) {

    var person = Person("zhagnsan",20,"beijing")
    println(person)

    person.age= 30
    println(person.age)

    var (name,age,address) = person

    println("$name , $age , $address ")

    println("-------------------------")

    var  person2 = Person2();
    println(person2)


}