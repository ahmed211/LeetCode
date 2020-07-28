package proplems_easy

fun reverseString(s: CharArray): Unit {
    var temp = 'a'
    for (i in 0 until s.size/2){
        temp = s[s.size - i - 1]
        s[s.size - i - 1] = s[i]
        s[i] = temp
    }
}
fun main(){
    reverseString(charArrayOf('h','e','l','l','o'))
}