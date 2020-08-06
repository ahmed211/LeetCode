package proplems_easy

import kotlin.math.log
import kotlin.math.pow

fun isPowerOfFour(num: Int): Boolean {

    if (num<4 && num != 1){
        return false
    }
    var mNum = num
    while(mNum != 1){
        if(mNum%4 == 0){
            mNum/=4
        }
        else{
            return false
        }
    }
    return true
}

//fun isPowerOfFour(num: Int): Boolean {
//    return 4.0.pow(log(num.toDouble(), 4.0)).toInt() == num && num > 0
//}

fun main(){
    print(isPowerOfFour(5))
}