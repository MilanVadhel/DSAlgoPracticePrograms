package com.example.kotlin.string

fun main(args: Array<String>) {
    reverseString("Milan")
    println()
    println("Reversed String : ${"Milan".reversed()}")
}

fun reverseString(str: String) {
    var reversedString = ""

    for (c in str.length - 1 downTo 0) {
        reversedString = reversedString.plus(str[c])
    }

    println("Original String : $str")
    println("Reversed String : $reversedString")
}