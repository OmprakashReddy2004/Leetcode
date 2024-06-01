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
    int currsum =0;
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res = new ArrayList<>();
        if(root==null){
            return res;
        }
        helper(root, targetSum,currsum, new ArrayList<>(), res);
        return res;
    }
    private void helper(TreeNode root,int targetSum, int currsum,List<Integer> subList,List<List<Integer>> res){
        if(root==null){
            return;
        }
        currsum+=root.val;
        subList.add(root.val);

        if(root.left==null && root.right==null && targetSum==currsum){
            res.add(new ArrayList<>(subList));
        }else{
            helper(root.left,targetSum,currsum,subList,res);
            helper(root.right,targetSum,currsum,subList,res);

        }
        subList.remove(subList.size()-1);
    }
}