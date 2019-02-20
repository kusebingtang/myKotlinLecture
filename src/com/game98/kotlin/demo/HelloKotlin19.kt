package com.game98.kotlin.demo

object MyObject {

    fun  method() {
        println("MyObject")
    }
}

fun main() {
    MyObject.method()

    println("--------------------")

//    MyTest.MyObject.method()
//    println(MyTest.MyObject.numberA)

    println("--------------------")

    MyTest.method()
    println(MyTest.numberA)
}

/**
 * companion object,伴生对象， 伴生对象可以访问类中的所有private成员
 * 在Kotlin中，与Java语言不同的是，Kotlin中的类没有static成员和方法（static关键字并不是Kotlin语言的一部分）
 * 在多数情况下，Kotlin推荐使用包级别的函数作为静态方法
 * Kotlin会将包级别的函数，当作静态方法看待
 *
 * 如果 companion object(伴生对象)没有提供名字，那么编译器会默认提供一个默认的名字Companion
 *
 * 注意：类的伴生对象会同样被编译成常规对象
 * 虽然伴生对象看起来像Java的静态成员，但在运行期，他们依旧是真实对象的实例成员
 * 在JVM上，可以将伴生对象的成员，真正的生成类的静态成员属性和方法，需要通过@JvmStatic注解来实现
 * 伴生对象编译后，会生成一个静态内部类
 *
 */
class MyTest {
    companion object MyObject{
        //@JvmStatic
        var numberA : Int = 100

        @JvmStatic
        fun method() {
            println("method call")
        }

    }
}