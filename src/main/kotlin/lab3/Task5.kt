package lab3

fun main(){
    var sum = 0
    for (number in 1 until 100 + 1) {
        if (number%4==0) sum+=number
    }
    println(sum)
}

