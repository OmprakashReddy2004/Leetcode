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
    public int findSecondMinimumValue(TreeNode root) {
        if (root == null) {
            return -1;
        }

        ArrayList<Integer> list = new ArrayList<>();
        recurse(root, list);
        
        if (list.isEmpty()) {
            return -1;
        }
        
        int max = list.get(0);
        long secondmax =  Long.MAX_VALUE;
        
        for (int num : list) {
            if (num > max && num < secondmax) {
                secondmax = num;
            }
        }
        
        if (secondmax < Long.MAX_VALUE) {
            return (int) secondmax;
        } else {
            return -1;
        }
    }
    
    public void recurse(TreeNode root, ArrayList<Integer> list) {
        if (root == null) {
            return;
        }
        list.add(root.val);
        recurse(root.left, list);
        recurse(root.right, list);
    }
}