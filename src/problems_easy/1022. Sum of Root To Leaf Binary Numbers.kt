package problems_easy

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

class BinaryTree {

    var root: TreeNode? = null

    private var sum = 0
    fun sumRootToLeaf(root: TreeNode?): Int {
        if (root == null) return sum
        paths(root, root.`val`)
        return sum
    }

    private fun paths(root: TreeNode, path: Int) {
        if (root.left == null && root.right == null) { // we have reached a leaf
            sum += path
            return
        }
        root.left?.let {
            val leftPath = (path shl 1) + it.`val` // shift left the current path and add the left node value
            paths(it, leftPath)
        }
        root.right?.let {
            val rightPath = (path shl 1) + it.`val`
            paths(it, rightPath)
        }
    }


}
fun main() {
    val tree = BinaryTree()
    tree.root = TreeNode(1)
    tree.root!!.left = TreeNode(0)
    tree.root!!.right = TreeNode(1)
    tree.root!!.left!!.left = TreeNode(0)
    tree.root!!.left!!.right = TreeNode(1)
    tree.root!!.right!!.left = TreeNode(0)
    tree.root!!.right!!.right = TreeNode(1)

    println(BinaryTree().sumRootToLeaf(tree.root))

//    println(BinaryTree().convertBinaryToDecimal(11111010100))


//    println(100 shl 2)
}