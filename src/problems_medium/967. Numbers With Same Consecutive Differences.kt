package problems_medium

val validNumbers = ArrayList<Int>()
var len = 0
fun numsSameConsecDiff(N: Int, K: Int): IntArray {

    if (N == 1){
        validNumbers.add(0)
    }
    len = N
    for (i in 1..9){

        isValid(i.toString(), K)
    }
    return validNumbers.toIntArray()
}

fun isValid(num: String, k: Int){

    if (num.length == len){
        validNumbers.add(num.toInt())
        return
    }
    val num1 = num[num.length-1] - '0' + k
    val num2 = num[num.length-1] - '0' - k

    if (num1 in 0..9) {
        isValid(num + num1.toString(), k)
    }
    if (num2 in 0..9 && num2 != num1) {
        isValid(num + num2.toString(), k)
    }
}


fun main(){
    println(numsSameConsecDiff(2, 0).contentToString())
}