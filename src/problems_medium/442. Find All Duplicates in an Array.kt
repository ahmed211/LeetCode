package problems_medium

fun findDuplicates(nums: IntArray): List<Int> {
    val elementCounts = IntArray(nums.size+1){0}
    val duplicateNums = ArrayList<Int>()
    for (num in nums){
        elementCounts[num]++
    }

    for (i in elementCounts.indices){
        if (elementCounts[i] > 1){
            duplicateNums.add(i)
        }
    }
    return duplicateNums
}

fun main(){
    println(findDuplicates(intArrayOf(4,3,2,7,8,2,3,1)))
}