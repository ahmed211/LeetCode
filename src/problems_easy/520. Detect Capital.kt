package problems_easy

fun detectCapitalUse(word: String): Boolean {
    var capital = 0
    var lower = 0
    for (char in word){
        if (char.isLowerCase()){
            lower++
        }
        else{
            capital++
        }
    }
    return capital == word.length || lower == word.length || (capital == 1 && word[0].isUpperCase())
}


fun main(){
    print(detectCapitalUse("FlaG"))
}