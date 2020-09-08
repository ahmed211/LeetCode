package problems_easy


// not solved yet
// wrong answer

fun wordPattern(pattern: String, str: String): Boolean {
    var text = str.replace("\\s".toRegex(), "")

    val patternSet = pattern.toSet().toList()
    val strSet = str.split(' ').toSet().toList()


    if (patternSet.size != strSet.size){
        return false
    }
    if (text.length == pattern.length){
        return true
    }
    for (i in patternSet.indices){

        text = text.replace(strSet[i], "${patternSet[i]}")
    }
    println(patternSet)
    println(strSet)
    println(text)
    return text == pattern
}


fun main(){
    println(wordPattern("syys", "a abc abc a"))
}
