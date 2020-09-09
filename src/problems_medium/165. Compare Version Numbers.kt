package problems_medium

fun compareVersion(version1: String, version2: String): Int {
    var v1 = version1.split('.').toMutableList()
    var v2 = version2.split('.').toMutableList()

    for (i in 0 until maxOf(v1.size, v2.size)){
        if (i == v1.size){
            v1.add("0")
        }
        else if (i == v2.size){
            v2.add("0")
        }

        if (v1[i].toInt() > v2[i].toInt()){
            return 1;
        }
        else if (v1[i].toInt() < v2[i].toInt()){
            return -1
        }
    }
    return 0;
}

fun main(){
    println(compareVersion("1.0", "1.0.0"))
}