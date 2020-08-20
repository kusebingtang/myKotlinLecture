package com.shengsiyuan.kotlin4

/**
@author JiangBin
@create 2020-08-20 15:04 */

import kotlin.properties.Delegates

// 非空属性
// notNull适用于那些无法在初始化阶段就确定属性值的场合
class MyPerson {
    var address: String by Delegates.notNull<String>()
}

fun main() {

    val myPerson = MyPerson();
    myPerson.address = "beijing"

    println(myPerson.address)

}