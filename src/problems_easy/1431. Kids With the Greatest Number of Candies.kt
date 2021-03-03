package problems_easy

fun kidsWithCandies(candies: IntArray, extraCandies: Int): BooleanArray {

    val boolArr = Array(candies.size){false}
    val maxCandy = candies.max()
    for (i in candies.indices){
        if (candies[i] + extraCandies >= maxCandy!!){
            boolArr[i] = true
        }
    }
    return boolArr.toBooleanArray()
}

fun main(){
    println(kidsWithCandies(intArrayOf(12,1,12), 10).contentToString())
}