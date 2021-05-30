package com.example.kotlin.string

/**
 * https://www.hackerrank.com/challenges/camelcase/problem
* */

fun main(args: Array<String>) {
    /**
     * Find the total number of words from given camelcase string "oneTwoThreeFour"
     *
     * */
    println("The Number or word in oneTwoThreeFour is : ${getNumOfWords("oneTwoThreeFour")}")
    println("The Number or word in saveChangesInTheEditor is : ${getNumOfWords("saveChangesInTheEditor")}")
}

fun getNumOfWords(str: String): Int {
    var wordCount = 1
    str.forEach {
        if (it.toInt() > 'A'.toInt() && it.toInt() < 'Z'.toInt()){
            wordCount++
        }
    }
    return wordCount
}