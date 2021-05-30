package com.example.kotlin.stack

import java.util.*

fun main(args: Array<String>) {
    var string = readLine()
    string?.let {
        println(getReversedString(it))
    }
}

fun getReversedString(string: String): String {
    var charArray = string.toCharArray()
    var stack = Stack<Char>()
    charArray.forEach {
        stack.push(it)
    }
    var reversedString = ""
    while (stack.isNotEmpty()) {
        reversedString += stack.pop()
    }
    return reversedString
}