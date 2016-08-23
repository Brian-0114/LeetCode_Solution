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
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> curr = new ArrayList<>();
        path(root,sum, curr, res);
        return res;
    }
    
    public void path(TreeNode root, int sum, List<Integer> curr, List<List<Integer>> res){
        if(root == null) return;
        
        curr.add(root.val);
        if(root.left == null && root.right == null && root.val == sum){
            res.add(new ArrayList(curr));
        }else{
            if(root.left != null) path(root.left, sum-root.val,curr,res);
            if(root.right != null) path(root.right, sum-root.val, curr,res);
        }
        curr.remove(curr.size()-1);
    }
}