package problems_easy

fun toGoatLatin(S: String): String {
    var lastA = "a"
    val goatWords: List<String> = S.split(" ").map {
        var word = it
        if (word[0].toLowerCase() == 'a' || word[0].toLowerCase() == 'e' || word[0].toLowerCase() == 'i'
            || word[0].toLowerCase() == 'o' || word[0].toLowerCase() == 'u'){
            word+= "ma"
        }
        else{
            word+=word[0]+"ma"
            word = word.drop(1)
        }
        word += lastA
        lastA += "a"
        word
    }
    return goatWords.joinToString().replace(",", "")
}

fun main(){
    println(toGoatLatin("I speak Goat Latin"))
}