package com.example.kotlin.array

fun main(args: Array<String>) {
    sumOfArray(arrayOf(1, 2, 3, 4, 5))
}

fun sumOfArray(array: Array<Int>) {
    var tempSum = 0
    for (i in array.indices) {
        tempSum += array[i]
    }
    println("Sum -> $tempSum")
}
