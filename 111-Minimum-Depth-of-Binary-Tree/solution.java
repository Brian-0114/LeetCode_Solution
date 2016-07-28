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
    public int minDepth(TreeNode root) {
        return minimumDepth(root);
    }
    
    public int minimumDepth(TreeNode root){
        if(root==null) return 0;
        
        if(root.left == null && root.right == null) return 1;
        
        if(root.left == null) return minimumDepth(root.right)+1;
        if(root.right == null) return minimumDepth(root.left)+1;
        
        return Math.min(minimumDepth(root.left),minimumDepth(root.right))+1;
        
    }
}