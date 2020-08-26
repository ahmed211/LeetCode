package problems_medium

fun mincostTickets(days: IntArray, costs: IntArray): Int {
    val travelDays = IntArray(days[days.size-1]+1){0}
//    if (costs[0] > costs [1]){
//        costs [0] = costs[1]
//    }
//    if (costs[1] > costs[2]){
//        costs[1] = costs[2]
//    }
    for (i in days){
        travelDays[i] = 1
    }

    for (day in 1 until travelDays.size){
        if (travelDays[day] == 1){
            var min = travelDays[day-1] + costs[0]
            if (day >= 7){
                min = Math.min(min, travelDays[day-7] + costs[1])
            }
            else{
                min = Math.min(min, costs[1])
            }
            if (day >= 30){
                min = Math.min(min, travelDays[day-30] + costs[2])
            }
            else{
                min = Math.min(min, costs[2])
            }
            travelDays[day] = min
        }
        else{
            travelDays[day] = travelDays[day-1]
        }
    }
    return travelDays[travelDays.size-1]
}

fun main(){
    println(mincostTickets(intArrayOf(1,2,3,4,6,8,9,10,13,14,16,17,19,21,24,26,27,28,29),
        intArrayOf(3,14,50)))
}