package com.example.kotlin.array

fun main(args: Array<String>) {
    reverseArray(arrayOf(4, 3, 9, 5, 2, 10, 7))
    println()
    reverseArray1(arrayOf(4, 3, 9, 5, 2, 10, 7))
    println()
    reverseArray2(arrayOf(4, 3, 9, 5, 2, 10, 7))
}

fun reverseArray(array: Array<Int>) {
    var tempArray = Array(array.size) { 0 }
    val lastIndex = array.size - 1
    for (i in 0..lastIndex) {
        tempArray[lastIndex - i] = array[i]
    }
    tempArray.forEach { print("$it ") }
}

fun reverseArray1(array: Array<Int>) {
    var tempArray = Array(array.size) { 0 }
    val lastIndex = array.size - 1
    for (i in lastIndex downTo 0) {
        tempArray[lastIndex - i] = array[i]
    }
    tempArray.forEach { print("$it ") }
}

fun reverseArray2(array: Array<Int>) {
    array.reversedArray().forEach { print("$it ") }
}