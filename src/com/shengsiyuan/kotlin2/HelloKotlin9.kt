package com.shengsiyuan.kotlin2

fun <T> getValue(item: T): T {
    return item
}

fun main() {
    val item = getValue(5)
    println(item)

    val item2 = getValue("hello")
    println(item2)

    var upperBoundsClass2 = UpperBoundsClass2<String>()
    println(upperBoundsClass2)
}

class UpperBoundsClass<T : List<T>> {

}

//很显然String既是Comparable和Any的子类型，其实Any的声明是可以去掉的
class UpperBoundsClass2<T> where T : Comparable<T>, T : Any {

}