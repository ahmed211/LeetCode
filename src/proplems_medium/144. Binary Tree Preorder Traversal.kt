package proplems_medium

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}


val traversalList = ArrayList<Int>()

fun preorderTraversal(root: TreeNode?): List<Int> {
    dfs(root)
    return traversalList
}

fun dfs(root: TreeNode?){
    if (root != null){
        traversalList.add(root.`val`)
        dfs(root.left)
        dfs(root.right)
    }
}

fun main(){
//    val t = TreeNode(5)
//    t.right!!.`val`=3
    println(preorderTraversal(TreeNode(5)))
    println(preorderTraversal(TreeNode(4)))
    println(preorderTraversal(TreeNode(2)))
}

