package lab2

fun main(){
    val export = readln().toInt()
    val import = readln().toInt()
    if (export>import){
        println("Ваша прибыль составила: ${export-import}")
    } else println("Ваши убытки составили: ${import-export}")
}