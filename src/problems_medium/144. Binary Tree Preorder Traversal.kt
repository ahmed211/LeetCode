package problems_medium

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}


private val traversalList = ArrayList<Int>()

fun preorderTraversal(root: TreeNode?): List<Int> {
    dfs(root)
    return traversalList
}

private fun dfs(root: TreeNode?){
    if (root != null){
        traversalList.add(root.`val`)
        dfs(root.left)
        dfs(root.right)
    }
}

fun main(){
    println(preorderTraversal(TreeNode(5)))
}

