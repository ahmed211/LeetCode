package problems_easy

import problems_medium.TreeNode

fun sumOfLeftLeaves(root: TreeNode?): Int {
    var sum = 0
    if (root == null){
        return 0
    }
    if (root.left != null && root.left!!.left == null && root.left!!.right == null){
        sum += root.left!!.`val`
    }
    return sum + sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right)
}

fun main() {

}