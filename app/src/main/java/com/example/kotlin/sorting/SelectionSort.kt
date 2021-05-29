package com.example.kotlin.sorting

fun main(args: Array<String>) {
    sortArray(arrayOf(9, 8, 7, 6, 5, 4, 3, 2, 1))
    println()
    sortArray(arrayOf(1000,900,800,700,600,500,400,300,200,100))
}

fun sortArray(intArray: Array<Int>) {
    var counterShift = 0
    var sortedArray = intArray
    var min = sortedArray[counterShift]
    var minIndex = counterShift
    while (counterShift < sortedArray.size-1) {
        for (i in counterShift..sortedArray.size - 1) {
            if (intArray[i] < min) {
                min = sortedArray[i]
                minIndex = i
            }
        }
        // swap
        var temp = sortedArray[counterShift]
        sortedArray[counterShift] = sortedArray[minIndex]
        sortedArray[minIndex] = temp

        // increment countershift from last one
        counterShift += 1
        // change the minindex value as per countershift
        minIndex = counterShift
        // change the min value as per countershift
        min = sortedArray[counterShift]
    }
    sortedArray.forEach { print("$it ") }
}