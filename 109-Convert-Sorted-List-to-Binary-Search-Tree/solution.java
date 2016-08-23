/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode sortedListToBST(ListNode head) {
         if (head==null){
      return null;
    }
    ListNode fast=head;
    ListNode slow=head;
    ListNode prev=null; 
	//to find the root of the tree
            while (fast!=null && fast.next!=null){
              fast=fast.next.next;
              prev=slow; 
              slow = slow.next;
            }
    TreeNode root=new TreeNode(slow.val);
            if (prev!=null){
              prev.next=null; 
            }else {
              head=null;
            }

    root.left=sortedListToBST(head);
    root.right=sortedListToBST(slow.next);
    return root;
  }
}