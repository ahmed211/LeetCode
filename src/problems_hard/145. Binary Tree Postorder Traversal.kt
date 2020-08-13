package problems_hard

import problems_medium.TreeNode

private val traversalList = ArrayList<Int>()

fun postorderTraversal(root: TreeNode?): List<Int> {
    dfs(root)
    return traversalList
}

private fun dfs(root: TreeNode?){
    if (root != null){
        dfs(root.left)
        dfs(root.right)
        traversalList.add(root.`val`)
    }
}

fun main(){
    println(postorderTraversal(TreeNode(5)))
}