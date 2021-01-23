package problems_medium

fun countVowelStrings(n: Int): Int {
    return ((n+4) * (n+3) * (n+2) * (n+1)) / 24
}

fun main(){
    println(countVowelStrings(33))
}