package problems_easy

//fun sortArrayByParity(A: IntArray): IntArray {
//    var odd = 0
//    var even = 0
//
//    while (even != A.size ){
//
//        if (A[even]%2 == 0 && A[odd]%2 == 1 && even > odd){
//            A[even] = A[odd].also {A[odd] = A[even] }
//            even++
//            odd++
//        }
//        else {
//            if (A[even] % 2 != 0) {
//                even++
//            }
//            if (A[odd] % 2 != 1) {
//                odd++
//            }
//            if (odd > even) {
//                even = odd
//            }
//        }
//    }
//    return A
//}

fun sortArrayByParity(A: IntArray): IntArray {
    val even = ArrayList<Int>()
    val odd = ArrayList<Int>()
    for (num in A){
        if (num%2 == 0){
            even.add(num)
        }
        else{
            odd.add(num)
        }
    }
    for (num in odd){
        even.add(num)
    }
    return even.toIntArray()
}
fun main(){
    println(sortArrayByParity(intArrayOf(4,2,5,7)).contentToString())
}