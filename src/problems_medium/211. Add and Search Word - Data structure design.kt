package problems_medium


// not solved yet
class WordDictionary() {

    /** Initialize your data structure here. */
    private val dictionaryList = ArrayList<String>()

    /** Adds a word into the data structure. */
    fun addWord(word: String) {
        dictionaryList.add(word)
    }

    /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
    fun search(word: String): Boolean {
//        var searchWord = word.replace(".", "/^[a-z]+\$/")
//        println(searchWord)

        if (word.isEmpty())
            return true
        for (searchWord in dictionaryList){

        }
        return false
    }

//    fun searchItem(searchWord: String, dictionaryWord: String): Boolean{
//        for (i in searchWord.indices){
//            if (word[i] != '.' && word[i]!=searchWord[i]){
//                break
//            }
//            return true
//        }
//    }

}

fun main() {
    val wordDictionary = WordDictionary()
    wordDictionary.addWord("bad")
    wordDictionary.addWord("dad")
    wordDictionary.addWord("mad")
    println(wordDictionary.search("pad"))
    println(wordDictionary.search("bad"))
    println(wordDictionary.search(".ad"))
    println(wordDictionary.search("b.."))
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * var obj = WordDictionary()
 * obj.addWord(word)
 * var param_2 = obj.search(word)
 */