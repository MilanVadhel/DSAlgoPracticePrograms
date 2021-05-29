package com.example.kotlin.array

fun main(args: Array<String>) {
    smallestNumber(2, arrayOf(7, 10, 4, 3, 20, 15))
}

fun smallestNumber(k: Int, array: Array<Int>) {
    val sortedArray = sortGivenArray(array)
    val kthSmallestNumber = sortedArray[k - 1]
    println("$k th smallest number is : $kthSmallestNumber")
    val kthLargestnumber = sortedArray[sortedArray.size - k]
    println("$k th largest number is : $kthLargestnumber")
}

fun sortGivenArray(intArray: Array<Int>): Array<Int> {
    var counterShift = 0
    var sortedArray = intArray
    var min = sortedArray[counterShift]
    var minIndex = counterShift
    while (counterShift < sortedArray.size - 1) {
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
    return sortedArray
}