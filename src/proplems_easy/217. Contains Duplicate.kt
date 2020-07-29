package proplems_easy

import java.util.*

fun containsDuplicate(nums: IntArray): Boolean {
    val numSet = nums.toSet()

    return numSet.size != nums.size
}

fun main(){
    print(containsDuplicate(intArrayOf(1,1,1,3,3,4,3,2,4,2)))
}