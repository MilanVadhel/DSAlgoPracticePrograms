package com.example.kotlin.string

fun main(args: Array<String>) {
    println("Enter the string : ")
    var string = readLine()
    string?.let {
        println(isPelindrom(string))
    }
}

fun isPelindrom(str: String): Boolean {
    return str.equals(reverseTheString(str), false)
}

fun reverseTheString(str: String): String {
    var reversedString = ""
    for (c in str.length - 1 downTo 0) {
        reversedString = reversedString.plus(str[c])
    }
    return reversedString
}