package com.kartikey.service

import org.springframework.stereotype.Service

@Service
class YourService {
    fun add(a: Int, b: Int): Int {
        val sum = a + b
        if (sum > 1000) {
            throw ArithmeticException("Sum is too large: $sum")
        }
        return sum
    }

    fun subtract(a: Int, b: Int): Int {
        return a - b
    }

    fun multiply(a: Int, b: Int): Int {
        return a * b
    }

    fun divide(a: Int, b: Int): Int {
        return a / b
    }
}
