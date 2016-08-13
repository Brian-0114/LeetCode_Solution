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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int inStart = 0;
        int inEnd = inorder.length -1;
        int postStart = 0;
        int postEnd = postorder.length - 1;
        
        return construct(inorder,inStart,inEnd, postorder,postStart,postEnd);
    }
    
    public TreeNode construct(int[] inorder, int inStart,int inEnd,int[] postorder,int postStart,int postEnd){
        if(inStart > inEnd || postStart > postEnd) return null;
        
        int val = postorder[postEnd];
        TreeNode p = new TreeNode(val);
        
        int k = 0;
        for(int i=0;i<=inorder.length;i++){
            if(inorder[i]==val){
                k=i;
                break;
            }
        }
        
        p.left = construct(inorder,inStart,k-1,postorder,postStart,postStart+k-inStart-1);
        p.right = construct(inorder,k+1,inEnd,postorder,postStart+k-inStart,postEnd-1);
     
     return p;   
    }
}