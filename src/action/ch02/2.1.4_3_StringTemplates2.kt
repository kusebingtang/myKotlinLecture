package ch02.ex1_4_3_StringTemplates2

fun main(args: Array<String>) {
    println("Hello, ${if (args.isNotEmpty()) args[0] else "someone"}!")
}
