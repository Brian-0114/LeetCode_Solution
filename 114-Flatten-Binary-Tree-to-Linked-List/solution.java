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
    public void flatten(TreeNode root) {
        while(root!=null){  
            if(root.left!=null){
            
                TreeNode pre = root.left;  
                //find the rightmost node of the left subtree
                while(pre.right!=null)  
                    pre = pre.right;  
                
                //connect right subtree of the root to the left subtree right most node
                pre.right = root.right;  
                
                root.right = root.left;  
                root.left = null;  
            }  
            //finish 1 , start 2 as the root and repeat
            root = root.right;  
        }  
    }
}