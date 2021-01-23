package problems_medium

///    time limit

fun maxOperations(nums: IntArray, k: Int): Int {
    var cont =0
    for (i in nums.indices){
        if (nums[i] != 0) {
            for (j in i + 1 until nums.size) {
                if (nums[j] != 0 && nums[i]+nums[j] == k){
                    cont++
                    nums[j] = 0
                    break
                }
            }
        }
    }
    return cont
}

fun main(){
    println(maxOperations(intArrayOf(1,2,3,4), 5))
}