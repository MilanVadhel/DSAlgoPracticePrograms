package com.example.kotlin.array

fun main(args: Array<String>) {
    checkKeyIsPresent(arrayOf(3, 5, 2, 4, 9, 3, 1, 7, 3, 11, 12, 3), 3, 3)
}

fun checkKeyIsPresent(array: Array<Int>, n: Int, key: Int) {
    var init = 0
    var keyPresentCount = 0
    var windowSize = n - 1
    for (i in array.indices) {
        for (j in init..windowSize) {
            if (array[j] == key) {
                keyPresentCount++
            }
        }
        init += windowSize + 1
        windowSize += n
    }

    if (keyPresentCount >= windowSize) {
        println("Yes")
    } else {
        println("No")
    }
}