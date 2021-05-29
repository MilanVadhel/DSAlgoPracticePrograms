package com.example.kotlin.array

fun main(args: Array<String>) {
    numOfOccurrence(1, arrayOf(1, 3, 1, 5, 6, 7, 1, 8, 5, 10, 1, 1, 1, 11))
}

fun numOfOccurrence(n: Int, array: Array<Int>) {
    var occurrence = 0
    for (i in array.indices) {
        if (n == array[i]) {
            occurrence++
        }
    }
    println("Num of Occurrence of $n is : $occurrence")
}