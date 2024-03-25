package lab1

fun main() {
    concatenate(23)
}

fun concatenate(number: Int){
    println("${number}${number*2}")
}