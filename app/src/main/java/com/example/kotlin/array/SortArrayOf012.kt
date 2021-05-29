package com.example.kotlin.array

fun main(args: Array<String>) {
    sortArray(arrayOf(0, 1, 2, 0, 1, 2))
}

fun sortArray(array: Array<Int>) {
    var arrayOf0 = mutableListOf<Int>()
    var arrayOf1 = mutableListOf<Int>()
    var arrayOf2 = mutableListOf<Int>()
    for (i in array.indices) {
        when (array[i]) {
            0 -> arrayOf0.add(array[i])
            1 -> arrayOf1.add(array[i])
            2 -> arrayOf2.add(array[i])
        }
    }
    var resultArray = mutableListOf<Int>()
    resultArray.addAll(arrayOf0)
    resultArray.addAll(arrayOf1)
    resultArray.addAll(arrayOf2)
    resultArray.forEach { print("$it ") }
}