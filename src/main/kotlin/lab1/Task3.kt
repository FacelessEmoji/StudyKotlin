package lab1

fun divide(number: Int){
    val digits = number.toString().map {
        it.toString().toInt()
    }
    println(digits.joinToString(", "))
}

fun main(){
    divide(5934)
}