/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int curr =0;
    int result = Integer.MIN_VALUE;
    public int kthSmallest(TreeNode root, int k) {
         helper(root,k);
         return result;
    
    }
    public void helper(TreeNode root,int k){
        if(root==null){
            return;
        }
        helper(root.left,k);
        curr++;
        if(curr==k){
           result = root.val;
       }
       helper(root.right,k);
    }
}