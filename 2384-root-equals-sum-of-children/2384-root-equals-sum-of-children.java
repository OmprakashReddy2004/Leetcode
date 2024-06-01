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
     int flag =0;
    public boolean checkTree(TreeNode root) {
        if(root==null){
            return false;
        }
        if(root.left.val + root.right.val == root.val){
            return true;
        }
        return false;
    }
   

}