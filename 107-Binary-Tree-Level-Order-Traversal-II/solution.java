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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        LinkedList<List<Integer>> res = new LinkedList<List<Integer>>();
        if(root== null) return res;
        
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.offer(root);
        
        while(!q.isEmpty()){
            int size = q.size();
            ArrayList<Integer> temp = new ArrayList<Integer>();
            for(int i=0;i<size;i++){
                TreeNode head = q.poll();
                temp.add(head.val);
                if(head.left != null) q.offer(head.left);
                if(head.right!= null) q.offer(head.right);
            }
            
            res.add(temp);
        }
        
        Collections.reverse(res);
        return res;
    }
}