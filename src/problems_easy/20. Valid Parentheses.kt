package problems_easy

import java.util.*

fun isValid(s: String): Boolean {
    val open = Stack<Char>()

    for (ch in s){
        if (ch == '(' || ch =='{' || ch == '['){
            open.push(ch)
        }
        else{
            if (open.size == 0){
                return false
            }
            else {
                val last = open.peek()
                if ((ch == ')' && last == '(') || (ch == ']' && last == '[') ||
                    (ch == '}' && last == '{')
                ) {
                    open.pop()
                } else {
                    return false
                }
            }
        }
    }
    return open.size == 0
}

fun main(){
    println(isValid("{[]}"))
}