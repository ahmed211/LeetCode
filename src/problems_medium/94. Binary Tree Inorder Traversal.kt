package problems_medium

//private val traversalList = ArrayList<Int>()

fun inorderTraversal(root: TreeNode?): List<Int> {
    val traversalList = ArrayList<Int>()
    dfs(root, traversalList)
    return traversalList
}



private fun dfs(root: TreeNode?, traversalList: ArrayList<Int>){
    if (root != null){
        traversalList.add(root.`val`)

//        println(root.`val`)
        if (root.left == null){
            println(traversalList)
        }
        else {
            dfs(root.left, traversalList)
            dfs(root.right, traversalList)
        }
    }
}

fun main(){
    println(inorderTraversal(TreeNode(5)))
}