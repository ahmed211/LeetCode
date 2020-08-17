package problems_easy

import java.util.*

fun distributeCandies(candies: Int, num_people: Int): IntArray {

    var can = candies
    var i = 0
    val distribute = IntArray(num_people){0}
    while (can > 0){
        if (can > i+1) {
            can -= i+1
            distribute[i % num_people] += ++i
        }
        else{
            distribute[i % num_people] += can
            can = 0

        }
    }
    return distribute
}

fun main(){
    println(distributeCandies(10, 3).contentToString())
}