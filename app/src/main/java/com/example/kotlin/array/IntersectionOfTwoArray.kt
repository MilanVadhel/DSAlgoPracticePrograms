package com.example.kotlin.array

fun main(args: Array<String>) {
    intersection(arrayOf(1, 2, 3, 4, 5), arrayOf(4, 5, 6, 7, 8))
}

fun intersection(array1: Array<Int>, array2: Array<Int>) {
    var resultArray = mutableListOf<Int>()
    var intersectionArray = mutableListOf<Int>()
    resultArray.addAll(array1)
    array2.forEach {
        if (resultArray.contains(it)) {
            intersectionArray.add(it)
        }
    }
    intersectionArray.forEach { print("$it ") }
}