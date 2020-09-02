package problems_easy

val validTime = ArrayList<String>()
fun largestTimeFromDigits(A: IntArray): String {
    A.sortDescending()

    heapPermutation(A, A.size, A.size)
    validTime.sortDescending()
    return if (validTime.size == 0)
        ""
    else
      validTime[0]
}


fun heapPermutation(a: IntArray, size: Int, n: Int) {
    // if size becomes 1 then prints the obtained
    // permutation
    if (size == 1){
        isValidTime(a)
    }
    for (i in 0 until size) {
        heapPermutation(a, size - 1, n)

        // if size is odd, swap first and last
        // element
        if (size % 2 == 1) {
            val temp = a[0]
            a[0] = a[size - 1]
            a[size - 1] = temp
        } else {
            val temp = a[i]
            a[i] = a[size - 1]
            a[size - 1] = temp
        }
    }
}

fun isValidTime(a: IntArray) {
    val h = a[0]*10 + a[1]
    val m = a[2]*10 + a[3]
    if (h <= 23 && m <= 59){
        validTime.add("${String.format("%02d", h)}:${String.format("%02d", m)}")
//        println("${String.format("%02d", h)}:${String.format("%02d", m)}")

    }
}
fun main(){
    println(largestTimeFromDigits(intArrayOf(2,0,0,4)))
}