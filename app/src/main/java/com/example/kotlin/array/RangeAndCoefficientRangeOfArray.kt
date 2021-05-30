package com.example.kotlin.array

fun main(args: Array<String>) {
    println("Range : ${getRange(arrayOf(15, 16, 10, 9, 6, 7, 17))}")
    println("Coefficient Range : ${getCoefficientRange(arrayOf(15, 16, 10, 9, 6, 7, 17))}")
}

fun getRange(array: Array<Int>): Int {
    val max = getMax(array)
    val min = getMin(array)
    val range = max - min
    return range
}

fun getCoefficientRange(array: Array<Int>): Float {
    val max = getMax(array).toFloat()
    val min = getMin(array).toFloat()
    val coefficientRange = (max - min) / (max + min)
    return coefficientRange
}

