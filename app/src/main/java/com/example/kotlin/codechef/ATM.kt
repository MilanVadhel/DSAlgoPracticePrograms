package com.example.kotlin.codechef

import java.util.*

fun main(args: Array<String>) {
    val reader = Scanner(System.`in`)
    var withdrawAmount = 0
    if (reader.hasNextInt()) {
        withdrawAmount = reader.nextInt()
    }
    var balance = 0F
    if (reader.hasNextFloat()) {
        balance = reader.nextFloat()
    }
    println(withDrawAmount(withdrawAmount, balance))
}

fun withDrawAmount(withdrawAmount: Int, balance: Float, bankCharges: Float = 0.50F): String {
    return if (withdrawAmount % 5 != 0 || (withdrawAmount > balance)) {
        String.format("%.2f", balance)
    } else {
        String.format("%.2f", balance - withdrawAmount - bankCharges)
    }
}

