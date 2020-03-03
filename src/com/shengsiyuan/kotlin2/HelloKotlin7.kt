package com.shengsiyuan.kotlin2

//星投影（star projection）

//1、对于Star<out T>协变：如果T的上界是TUpper，那么Star<*>就相当于Star<out T>，
// 这表示当T的类型未知时，你可以安全地读取TUpper类型的值，
// 言外之意就是从Star<*>取出来的元素都会当成TUpper类型。

//2、对于Star<in T>逆变：Star<*>就相当于Star<in Nothing>，其中Nothing的类定义为：

//3、对于Star<T>不变：如果T的上界为TUpper，那么Star<*>就相当于读取时的Star<out TUpper>以及写入时的Star<in Nothing>。
class Star<out T> {

}

class Star2<in T> {
    fun setValue(t: T) {

    }
}

fun main() {
    val star: Star<Number> = Star<Int>()
    var star2: Star<*> = star

    val star3: Star2<Int> = Star2<Number>()
    var star4: Star2<*> = star3

    //star4.setValue(3 as Nothing)//java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.Void
    //star4.setValue(3) //Error  Star<*>就相当于Star<in Nothing>

    val start5 : Start3<String> = Start3("hello")
    val start6 :Start3<*> = start5

    println(start6.getValue())//对于Star<T>不变：如果T的上界为TUpper，那么Star<*>就相当于读取时的Star<out TUpper>以及写入时的Star<in Nothing>。

    //start6.setValue("test")// Error

    println("-----------")

    var list: MutableList<*> = mutableListOf("hello","world","hello world")
    println(list[0])

    //list[0] = "test" // Type mismatch required Nothing
    //public interface MutableList<E> 



}

class Start3<T>(private var t: T) {
    fun setValue(t: T) {
        this.t = t
    }

    fun getValue(): T {
        return  this.t
    }

}

