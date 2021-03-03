package problems_easy

fun missingNumber(nums: IntArray): Int {
    val existNums = IntArray(nums.size+1) {0}

    for (num in nums){
        existNums[num] = 1
    }

    for (i in existNums.indices){
        if (existNums[i] == 0){
            return i
        }
    }
    return 0
}

fun main(){
    println(missingNumber(intArrayOf(3,0,1)))
}