package problems_medium

fun groupThePeople(groupSizes: IntArray): List<List<Int>> {
    val parentGroup: ArrayList<ArrayList<Int>> = ArrayList()
    val groupMap: HashMap<Int, ArrayList<Int>> = HashMap()
    var groupNum = 0
    for (ind in groupSizes.indices) {
        if (groupMap[groupSizes[ind]].isNullOrEmpty()) {
            groupMap[groupSizes[ind]] = ArrayList()
        }
        groupMap[groupSizes[ind]]!!.add(ind)
    }
    var id = 0
    parentGroup.add(ArrayList())
    for (key in groupMap.keys) {

        for (value in groupMap[key]!!) {
            parentGroup[groupNum].add(value)
            id++
            if (id == key) {
                groupNum++
                id = 0
                parentGroup.add(ArrayList())
            }
        }
    }
    parentGroup.removeAt(parentGroup.size - 1)
    return parentGroup
}

fun main() {
    print(groupThePeople(intArrayOf(2, 1, 3, 3, 3, 2)))
}
