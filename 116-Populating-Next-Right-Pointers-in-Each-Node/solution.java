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
        if(root==null)
            return;
        Queue<TreeLinkNode> q=new LinkedList<TreeLinkNode>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            TreeLinkNode node=q.remove();
            if(!q.isEmpty()){
               node.next=q.peek();
               if(node.left!=null)
                   q.add(node.left);
               if(node.right!=null)
                   q.add(node.right);
               if(q.peek()==null){
                   q.add(null);
                   q.remove();
               }
           }              
        }
    }
    
}