package proplems_easy

fun isPalindrome(s: String): Boolean {
    val plain = Regex("[^a-z0-9]").replace(s.toLowerCase(), "")
    for (i in 0 until plain.length/2){
        if (plain[i] != plain[plain.length-i-1]){
            return false
        }
    }
    return true
}

fun main(){
    println(isPalindrome("A man, a plan, a canal: Panama"))
}