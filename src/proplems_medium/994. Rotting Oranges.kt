package proplems_medium

import proplems_easy.removeDuplicates

fun orangesRotting(grid: Array<IntArray>): Int {
    val totalSize = grid.size*grid[0].size
    var cont = 0
    var valueChanged = 0
    for (i in 0..totalSize){
        for (j in grid.indices){
            for(k in grid[0].indices){
                if (grid[j][k] == 2){
                    if(k+1 < grid[0].size && grid[j][k+1] == 1){
                        grid[j][k+1] = 2
                        valueChanged = 1
                    }
                    else if(k-1 >= 0 && grid[j][k-1] == 1){
                        grid[j][k-1] = 2
                        valueChanged = 1
                    }
                    else if(j+1 < grid.size && grid[j+1][k] == 1){
                        grid[j][k+1] = 2
                        valueChanged = 1
                    }
                    else if(j-1 >= 0 && grid[j-1][k] == 1){
                        grid[j-1][k] = 2
                        valueChanged = 1
                    }
                }
            }
        }
        if (valueChanged == 1){
            cont++
            valueChanged = 0
        }

    }

    return if (cont == 0){
        -1
    }
    else {
        cont
    }
}


fun main(){
    print(orangesRotting(arrayOf(intArrayOf(2,1,1), intArrayOf(1,1,0), intArrayOf(0,1,1))))
}