package lab7

import kotlinx.coroutines.*

suspend fun complexMathOperation(param1: Int, param2: Int): Double {
    delay(2000)
    val result = Math.sqrt(Math.pow(param1.toDouble(), param2.toDouble()))
    return result
}

fun main() {
    GlobalScope.launch {
        val result = complexMathOperation(999, 76)
        println("Результат сложной математической операции: $result")
    }
    Thread.sleep(3000)
}
