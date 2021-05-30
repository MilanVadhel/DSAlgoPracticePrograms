package com.example.kotlin.codechef

import java.util.*

fun main(args: Array<String>) {
    var reader = Scanner(System.`in`)
    if(reader.hasNextInt()){
        var n = reader.nextInt()
        var k = reader.nextInt()
        println("Count : ${getNumOfIntegersDivisibleByK(n, k)}")
    }
}

fun getNumOfIntegersDivisibleByK(n: Int, k: Int): Int {
    var counter = 0
    var reader = Scanner(System.`in`)
    for (i in 1..n) {
        if(reader.hasNextInt()){
            if (reader.nextInt() % k == 0) {
                counter++
            }
        }
    }
    return counter
}