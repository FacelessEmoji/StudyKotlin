package lab5

import kotlin.math.roundToInt

fun round(number: Int):String{
    return if (number > 999){
        "${(number.toFloat()/1000).roundToInt()}k"
    } else number.toString()
}

fun main(){
    println(round(250555))
    println(round(743))
    println(round(1499))
}