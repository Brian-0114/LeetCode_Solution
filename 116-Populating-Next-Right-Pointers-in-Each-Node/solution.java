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
         
        TreeLinkNode curr = root;
         
        while (curr != null && curr.left != null && curr.right != null) {
            TreeLinkNode p = curr;
            while (p != null) {
                if (p.left != null) {
                    p.left.next = p.right;
                }
             
                if (p.right != null && p.next != null) {
                    p.right.next = p.next.left;
                }
                 
                p = p.next;
            }
             
            curr = curr.left;
        }
    }
    
}
    
