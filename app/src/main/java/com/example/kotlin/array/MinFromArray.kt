package com.example.kotlin.array

fun main(args: Array<String>) {
    print("${getMin(arrayOf(3, 5, 7, 1, 90, 70, 2, 10))}")
}

fun getMin(array: Array<Int>): Int {
    var tempMin = array[0]
    for (i in array.indices) {
        if (array[i] < tempMin) {
            tempMin = array[i]
        }
    }
    return tempMin
}