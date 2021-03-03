package problems_easy

fun findErrorNums(nums: IntArray): IntArray {
    var dup = 0
    var miss = 0
    var cont = 0
    for(i in 1..nums.size){
        cont = 0
        for (num in nums){
            if (num == i){
                cont++
            }
        }
        if (cont == 2){
            dup = i
        }
        else if (cont == 0){
            miss = i
        }
    }
    return intArrayOf(dup, miss)
}

fun main(){
    println(findErrorNums(intArrayOf(3,2,2)).contentToString())
}