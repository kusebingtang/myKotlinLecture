package com.shengsiyuan.kotlin2

/**
 * 如果泛型类只是将泛型类型作为其方法的输出类型，那么我们就可以使用out
 *
 * produce = output = out
 */
interface Producer<out T> {

    fun produce(): T

}

/**
 * 如果泛型类只是将泛型类型作为其方法的输入类型，那么我们就可以使用in
 *
 * consumer = intput = in
 */
interface Consumer<in T> {

    fun consume(item: T)

}

/**
 * 如果泛型类同时将泛型类型作为其方法的输入类型与输出类型，那么我们就不能使用out与in来修饰泛型
 */
interface ProducerConsumer<T> {
    fun produce(): T

    fun consume(item: T)
}

open class Fruit

open class Apple: Fruit()

class ApplePear: Apple()

class FruitProducer: Producer<Fruit> {
    override fun produce(): Fruit {
        println("Produce Fruit")

        return Fruit()
    }

}

class AppleProducer: Producer<Apple> {
    override fun produce(): Apple {
        println("Produce Apple")

        return Apple()
    }

}

class ApplePearProducer: Producer<ApplePear> {
    override fun produce(): ApplePear {
        println("Produce ApplePear")

        return ApplePear()
    }

}

fun main(args: Array<String>) {
    //对于"out"泛型来说，我们可以将子类型对象赋给父类型引用
    var producer1: Producer<Fruit> = FruitProducer()
    var producer2: Producer<Fruit> = AppleProducer()
    var producer3: Producer<Fruit> = ApplePearProducer()
    var producer4: Producer<ApplePear> = ApplePearProducer()

    println(producer1.produce())
    println(producer3.produce())


    println("-----------")

    val consumer1 : Consumer<ApplePear> = Human()
    val consumer2 : Consumer<ApplePear> = Man()
    val consumer3 : Consumer<ApplePear> = Boy()

    consumer2.consume(ApplePear());
    consumer1.consume(ApplePear())
    consumer3.consume(producer4.produce())


}

class Human: Consumer<Fruit> {
    override fun consume(item: Fruit) {
        println("Consume Fruit")
    }

}

class Man: Consumer<Apple> {
    override fun consume(item: Apple) {
        println("Consume Apple")
    }

}

class Boy: Consumer<ApplePear> {
    override fun consume(item: ApplePear) {
        println("Consume ApplePear")
    }

}