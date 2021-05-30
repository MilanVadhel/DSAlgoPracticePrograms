package com.example.kotlin.array

fun main(args: Array<String>) {
    union(arrayOf(1, 2, 3, 4, 5), arrayOf(1, 2, 3, 6, 7))
}

fun union(array1: Array<Int>, array2: Array<Int>) {
    var resultArray = mutableListOf<Int>()
    resultArray.addAll(array1)
    array2.forEach {
        if (!resultArray.contains(it)) {
            resultArray.add(it)
        }
    }
    resultArray.forEach { print("$it ") }
}