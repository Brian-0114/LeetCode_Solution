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
    public int rob(TreeNode root) {
	        return dfs(root)[1];
	    }
	    
    private int[] dfs(TreeNode root) {
	    	
	    	int [] res = new int[2];
	        if(root==null) return res;
	        int [] l = dfs(root.left);
	        int [] r = dfs(root.right);
	        res[0] = l[1] + r[1];
	        res[1] = Math.max(res[0], l[0] + r[0] + root.val);
	        return res;
	    }
}