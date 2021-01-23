package problems_easy

fun runningSum(nums: IntArray): IntArray {
    for (i in nums.indices){
        if (i != 0) {
            nums[i] = nums[i - 1] + nums[i]
        }
    }
    return nums
}

fun main(){
    println(runningSum(intArrayOf(1,1,1,1,1)).contentToString())
}