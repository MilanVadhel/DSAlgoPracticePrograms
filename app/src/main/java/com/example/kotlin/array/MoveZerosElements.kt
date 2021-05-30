package com.example.kotlin.array

fun main(args: Array<String>) {
    moveZerosElements(arrayOf(0, 1, 2, 3, 0, 6, 7, 0, 9, 8))
    println()
    moveZerosElements(arrayOf(0, 0, 0, -1, 2, 3, 5, 0, 8, 0))
}

fun moveZerosElements(array: Array<Int>) {
    var counterShift = 0
    for (i in array.indices) {
        if (array[i] == 0) {
            var temp = array[i]
            array[i] = array[counterShift]
            array[counterShift] = temp
            counterShift++
        }
    }
    array.forEach { print("$it ") }
}