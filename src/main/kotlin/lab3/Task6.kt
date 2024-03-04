package lab3

fun main(){
    var sum = 0
    var currentNumber = 5
    while (currentNumber !=58){
        if ((currentNumber!=34) or (currentNumber!=46) or (currentNumber!=52)){
            sum+=currentNumber
        }
        currentNumber++
    }
    println(sum)
}
