package problems_easy

fun firstUniqChar(s: String): Int {
    var alphabet = IntArray(26) {0}

    for (char in s){
        alphabet[char.toInt()%26]++
        println(char.toInt()%26)
    }

    for (i in s.indices){
        if( alphabet[s[i].toInt()%26] == 1){
            return i
        }
    }
    return -1
}

fun main(){
    print(firstUniqChar("abcdefghijklmnopqrstuvwxyz"))
}