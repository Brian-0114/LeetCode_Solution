/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
     public void connect(TreeLinkNode root) {
        if (root == null) {
            return;
        }

        TreeLinkNode parent = root;  //current node of current level
        TreeLinkNode pre;  //the leading node on the next level
        TreeLinkNode next;  //head of the next level
        while (parent != null) {
            pre = null;
            next = null;
            while (parent != null) {    //iterate on the current level
                if (next == null){
                    next = (parent.left != null) ? parent.left: parent.right;
                }

                if (parent.left != null){
                    if (pre != null) {
                        pre.next = parent.left;
                        pre = pre.next;
                    } else {
                        pre = parent.left;
                    }
                }

                if (parent.right != null) {
                    if (pre != null) {
                        pre.next = parent.right;
                        pre = pre.next;
                    } else {
                        pre = parent.right;
                    }
                }
                parent = parent.next;   //move to next node on the same level
            }
            parent = next;  //move down
        }
    }
}