package com.example.kotlin.array


fun main(args: Array<String>) {
    print("${getMax(arrayOf(3, 5, 7, 1, 90, 70, 2, 10))}")
}

fun getMax(array: Array<Int>): Int {
    var tempMax = array[0]
    for (i in array.indices) {
        if (array[i] > tempMax) {
            tempMax = array[i]
        }
    }
    return tempMax
}