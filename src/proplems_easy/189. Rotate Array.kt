package proplems_easy

import java.util.*

fun rotate(nums: IntArray, k: Int): Unit {

    val rotatedArray = nums.copyOf()

    for (i in nums.indices){
        nums[(i + k)%nums.size] = rotatedArray[i]
    }
//    println(nums.contentToString())
}

fun main(){
    rotate(intArrayOf(1, 3, 4, 5, 6, 7), 3)
}