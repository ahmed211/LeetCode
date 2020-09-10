package problems_easy

import java.lang.StringBuilder
import kotlin.math.min

// two solutions available

//fun getHint(secret: String, guess: String): String {
//    val sec = StringBuilder(secret)
//    val gus = StringBuilder(guess)
//    var a = 0
//    var b = 0
//    for (i in secret.indices){
//        if (secret[i] == guess[i]){
//            a++
//            sec[i] = '.'
//            gus[i] = '.'
//        }
//    }
//
//    for (i in sec.indices){
//        if (sec[i] != '.') {
//            for (j in sec.indices) {
//                if (sec[i] == gus[j]) {
//                    b++
//                    gus[j] = '.'
//                    sec[i] = '.'
//                    break
//                }
//            }
//        }
//    }
//    return "${a}A${b}B"
//}

fun getHint(secret: String, guess: String): String {
    val secretCont = IntArray(10) {0}
    val guessCont = IntArray(10) {0}
    var a = 0
    var b = 0

    for (i in secret.indices){
        if (secret[i] == guess[i]){
            a++
        }
        else{
            secretCont[secret[i]-'0']++
            guessCont[guess[i]-'0']++
        }
    }
    for (i in secretCont.indices){
        b += min(secretCont[i], guessCont[i])
    }
    return "${a}A${b}B"
}
fun main(){
    println(getHint("1807", "7810"))
}