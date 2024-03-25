package lab3

fun main(){
    var sum = 0
    for (number in 0 until 101 step 4) {
        sum+=number
    }
    println(sum)
}

