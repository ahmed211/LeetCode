package proplems_easy

fun removeDuplicates(nums: IntArray): Int {
    if (nums.isEmpty()){
        return 0
    }
    var ind1 = 0
    for (ind2 in 1 until nums.size){
        if (nums[ind1] < nums[ind2]) {
            ind1++
            nums[ind1] = nums[ind2]
        }
    }
    return ind1+1
}

fun main(){
    print(removeDuplicates(intArrayOf()))
}