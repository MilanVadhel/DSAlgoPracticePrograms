package com.example.kotlin.sorting

fun main(args: Array<String>) {
    sortArrayUsingBubbleSort(arrayOf(4, 3, 1, 2))
}

fun sortArrayUsingBubbleSort(array: Array<Int>) {
    var sortedArray = array
    var numOfSwap = 0
    var j = array.size - 1
    while (j!=0){
        for (i in 0..j) {
            if (i != j) {
                if (sortedArray[i] > sortedArray[i + 1]) {
                    var temp = sortedArray[i + 1]
                    sortedArray[i + 1] = sortedArray[i]
                    sortedArray[i] = temp
                    numOfSwap +=1
                }
            } else {
                j -= 1
            }
        }
    }
    sortedArray.forEach { print("$it ") }
    println()
    println("Array is sorted in ${numOfSwap} swaps. ")
    println("First Element: ${sortedArray[0]} ")
    println("Last Element: ${sortedArray[sortedArray.size-1]} ")
}