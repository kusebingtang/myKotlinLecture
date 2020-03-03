package com.shengsiyuan.kotlin2

class MyStorage<out T>(private var t: T) {

    fun getValue(): T {
        return this.t
    }

    //Suppresses errors about variance conflict
    //压制变量冲突错误
    fun setValue(t: @UnsafeVariance T) { //在某些实际情况下可能不得已要能将它作为参数进行写入，那怎么打破这个规则呢？其实Kotlin给咱们提供了一个注解能打破此规则
        this.t = t
    }

}

fun main() {
    var myStorage1 :  MyStorage<Int> = MyStorage(5)
    val myStorage2: MyStorage<Any> = myStorage1

    println(myStorage2.getValue())

    myStorage2.setValue("hello")
    println(myStorage2.getValue())
    //myStorage2是指向Int类型的myStorage1，
    // 而居然往myStorage2中写入了一个字符串，这不是违背常理么？
    // 其实原因是泛型擦除所决定的，
    // 我们在代码中声明的任何类型类型其实到了字节码当中都会不成Object类型，
    // 也就是泛型在字节码的层面类型信息就被擦除了，而当我们从泛型来读取时则会强制进行类型转换，回到咱们的程序，
    // 当在执行myStorage2.getValue()时，其实最终会强制转换成Any类型，所以程序也没毛病。
}