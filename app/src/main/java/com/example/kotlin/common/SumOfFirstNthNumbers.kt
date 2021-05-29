package com.example.kotlin.common

fun main(args: Array<String>) {
    sumOfFirstNthNumbers(10)
    sumOfFirstNthNumbers1(10)
}

fun sumOfFirstNthNumbers(n: Long) {
    var tempSum = 0L
    for (i in 1..n) {
        tempSum += i
    }
    println("Sum -> $tempSum")
}

fun sumOfFirstNthNumbers1(n: Long) {
    var sum = (n * (n + 1)) / 2
    println("Sum of first $n numbers is : $sum")
}