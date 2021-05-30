package com.example.kotlin.array

fun main(args: Array<String>) {
    moveNegativeNumbers(arrayOf(-1, -2, 4, 5, -3))
    println()
    moveNegativeNumbers(arrayOf(-12, 11, -13, -5, 6, -7, 5, -3, -6))
}

fun moveNegativeNumbers(array: Array<Int>) {
    var counterShift = 0
    for (i in array.indices) {
        if (array[i] < 0) {
            var temp = array[i]
            array[i] = array[counterShift]
            array[counterShift] = temp
            counterShift++
        }
    }
    array.forEach { print("$it ") }
}