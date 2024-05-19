package lab7

import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

suspend fun withTimeout(timeoutMs: Long, block: suspend () -> Unit) {
    val executionTime = measureTimeMillis {
        withTimeoutOrNull(timeoutMs) {
            block()
        }
    }
    if (executionTime >= timeoutMs) {
        println("Too long body execution")
    }
}

suspend fun longRunningTask() {
    delay(2000)
    println("Long running task completed")
}

suspend fun shortRunningTask() {
    delay(500)
    println("Short running task completed")
}

fun main() = runBlocking<Unit> {
    withTimeout(1000) {
        longRunningTask()
    }

    withTimeout(1000) {
        shortRunningTask()
    }
}
