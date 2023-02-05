package problems_easy


fun runningSum(nums: IntArray): IntArray {

    for (i in 1 until nums.size){
        nums[i] += nums[i-1]
    }
    return nums
}

fun main() {
    println( runningSum(intArrayOf(1, 2,3)).contentToString())
}