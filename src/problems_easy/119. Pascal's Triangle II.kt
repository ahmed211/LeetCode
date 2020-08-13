package problems_easy

import java.math.BigInteger

fun getRow(rowIndex: Int): List<Int> {

    val rowList = ArrayList<Int>()
    rowList.add(1)
    for (i in 1 until rowIndex+1){
        val min = minOf(i, (rowIndex-i))
        val max = maxOf(i, (rowIndex-i))
        val top = getFactorial(max+1, rowIndex)
        val bottom = getFactorial(1, min)
        rowList.add((top/bottom).toInt())
    }
    return rowList
}

fun getFactorial(start: Int, end: Int): BigInteger{
    var factorial = BigInteger.ONE
    for (i in start until end+1) {
        // factorial = factorial * i;
        factorial *= i.toBigInteger()
    }
    return factorial
}

fun main(){
    println(getRow(30))
}