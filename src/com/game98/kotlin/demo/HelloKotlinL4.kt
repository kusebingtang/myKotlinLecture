package com.game98.kotlin.demo

import java.lang.NumberFormatException

fun main(args: Array<String>) {

    printMutilly("3","4")

    printMutilly2("3","5")


}

fun convert2Int(str:String): Int? {

    try {
        return str.toInt()
    }catch (ex: NumberFormatException)
    {
        return  null
    }
}


fun printMutilly(a:String, b:String)
{
    val a2Int = convert2Int(a)

    val b2Int = convert2Int(b)

    if(null!=a2Int && null!=b2Int){
        println(a2Int * b2Int)
    }
    else
    {
        println("param not int")
    }
}


fun printMutilly2(a: String,b: String)
{
    val a2Int = convert2Int(a)
    val b2Int = convert2Int(b)

//    println(a2Int*b2Int)

    if (null==a2Int)
    {
        println("param a not int")
    }else if (null==b2Int)
    {
        println("param b not int")
    }else
    {
        println(a2Int*b2Int)
    }
}