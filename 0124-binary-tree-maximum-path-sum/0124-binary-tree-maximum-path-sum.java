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
    private int maxValue = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        helper(root);
        return maxValue;
    }

    private int helper(TreeNode node) {
        if (node == null) {
            return 0;
        }

        // Recursively calculate the maximum sum on the left and right subtrees.
        int left = Math.max(0, helper(node.left));
        int right = Math.max(0, helper(node.right));

        // Calculate the maximum path sum with the current node as the root.
        int currentMaxPath = left + right + node.val;

        // Update the global maximum path sum.
        maxValue = Math.max(maxValue, currentMaxPath);

        // this value is the value that every node returns after its backtracking
        return Math.max(left, right) + node.val;
    }
}
