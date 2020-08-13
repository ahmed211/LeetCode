package problems_easy

import kotlin.collections.ArrayList

fun decompressRLElist(nums: IntArray): IntArray {
    val decompressList = ArrayList<Int>()

    for (i in nums.indices step 2){
        for (j in 1..nums[i]){
            decompressList.add(nums[i+1])
        }
    }
    return decompressList.toIntArray()
}

fun main(){
    print(decompressRLElist(intArrayOf(1, 2, 3, 4)).contentToString())
}