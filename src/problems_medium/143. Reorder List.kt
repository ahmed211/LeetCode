package problems_medium

//fun reorderList(head: ListNode?): Unit {
//    var cur = head
//    while(cur!!.next.next == null){
//        println(cur.`val`)
//        // cur = cur.next
//        cur = cur.next
//
//    }
//    cur!!.next.next = head!!.next
//    head.next = cur.next
//    cur.next = null
//}


class Node<T>(value: T) {
    var value: T = value
    var next: Node<T>? = null
    var previous: Node<T>? = null
}

class LinkedList<T> {
    private var head: Node<T>? = null
    var isEmpty: Boolean = head == null
    fun first(): Node<T>? = head
    fun last(): Node<T>? {
        var node = head
        if (node != null) {
            while (node?.next != null) {
                node = node?.next
            }
            return node
        } else {
            return null
        }
    }

    fun count(): Int {
        var node = head
        if (node != null) {
            var counter = 1
            while (node?.next != null) {
                node = node?.next
                counter += 1
            }
            return counter
        } else {
            return 0
        }
    }

    fun nodeAtIndex(index: Int): Node<T>? {
        if (index >= 0) {
            var node = head
            var i = index
            while (node != null) {
                if (i == 0) return node
                i -= 1
                node = node.next
            }
        }
        return null
    }

    fun append(value: T) {
        var newNode = Node(value)
        var lastNode = this.last()
        if (lastNode != null) {
            newNode.previous = lastNode
            lastNode.next = newNode
        } else {
            head = newNode
        }
    }

    fun removeAll() {
        head = null
    }

    fun removeNode(node: Node<T>): T {
        val prev = node.previous
        val next = node.next
        if (prev != null) {
            prev.next = next
        } else {
            head = next
        }
        next?.previous = prev
        node.previous = null
        node.next = null
        return node.value
    }

    fun removeLast(): T? {
        val last = this.last()
        if (last != null) {
            return removeNode(last)
        } else {
            return null
        }
    }

    fun removeAtIndex(index: Int): T? {
        val node = nodeAtIndex(index)
        if (node != null) {
            return removeNode(node)
        } else {
            return null
        }
    }

    override fun toString(): String {
        var s = "["
        var node = head
        while (node != null) {
            s += "${node.value}"
            node = node.next
            if (node != null) {
                s += ", "
            }
        }
        return s + "]"
    }

//    fun reorderList(hd: Node<T>): Unit {
//        if (hd == null || hd.next == null){
//            return
//        }
//        var head = hd
//        var p1 = hd
//        var p2 = hd
//
//        while (p2.next != null && p2.next!!.next != null){
//            p2 = p2.next!!.next!!
//            p1 = p1.next!!
//        }
//
//        var p3 = p1.next
//        p1.next = null
//        p3 = reverse(p3)
//
//        var cur = head
//        var tmp = p3!!.next
//        while (p3 != null ){
//            tmp = p3!!.next
//            p3.next = cur.next
//            cur.next = p3
//            p3 = tmp
//            if (tmp != null)
//                cur = cur.next!!.next!!
//        }
//
//    }
//
//    fun reverse(node: Node<T>?): Node<T>? {
//        var prev: Node<T>? = null
//        var current = node
//        var next: Node<T>?
//        while (current != null) {
//            next = current.next
//            current.next = prev
//            prev = current
//            current = next
//        }
//        return prev
//
//}


    // final submit solution
    fun reorderList(head: ListNode?): Unit {
        if (head == null || head.next == null){
            return
        }
        //   var head = head
        var p1 = head
        var p2 = head

        while (p2!!.next != null && p2.next!!.next != null){
            p2 = p2.next!!.next!!
            p1 = p1!!.next!!
        }

        var p3 = p1!!.next
        p1.next = null
        p3 = reverse(p3)

        var cur = head
        var tmp = p3!!.next
        while (p3 != null ){
            tmp = p3!!.next
            p3.next = cur!!.next
            cur.next = p3
            p3 = tmp
            if (tmp != null)
                cur = cur.next!!.next!!
        }

    }

    fun reverse(hd: ListNode): ListNode {
        var head = hd
        var prev =  ListNode(0)
        prev.next = head
        head = prev
        var current = prev.next
        //  var next: ListNode?
        while (current.next != null) {

            var tmp = current.next
            current.next = tmp.next
            tmp.next = prev.next
            prev.next = tmp

        }

        return prev.next
    }

fun main() {
    var ll = LinkedList<Int>()
    ll.append(1)
    ll.append(2)
    ll.append(3)
    ll.append(4)
//    ll.append(5)
//    ll.append(6)

    ll.reorderList(ll.first()!!)
    println(ll)
}
