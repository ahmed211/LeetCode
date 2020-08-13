package problems_medium

private val traversalList = ArrayList<Int>()

fun inorderTraversal(root: TreeNode?): List<Int> {
    dfs(root)
    return traversalList
}

private fun dfs(root: TreeNode?){
    if (root != null){
        dfs(root.left)
        traversalList.add(root.`val`)
        dfs(root.right)
    }
}

fun main(){
    println(inorderTraversal(TreeNode(5)))
}