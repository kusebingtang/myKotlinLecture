package com.game98.kotlin.demo


/**
 * 在kotlin中，所有类的类型默认为final类型，默认情况下是无法被继承的。
 * 换句话说，kotlin默认情况下，所有类的类型默认为final类型
 * open关键字的含义与final含义相反
 */
open class Parent(name: String, age: Int) {

}

class Child(name: String,age: Int) : Parent(name,age) {

}

open class Parent2(name: String) {

}

/**
 * 在kotlin中，如果一个类继承一个父类型，子类并且没有primary构造方法
 * 那么这个子类的每个secondary构造方法就需要通过super关键字初始化父类型
 * 不同secondary构造方法可以调用父类型的不同的构造方法
 */
class  Child2 : Parent2 {

    constructor(name: String) :super(name) {

    }
}