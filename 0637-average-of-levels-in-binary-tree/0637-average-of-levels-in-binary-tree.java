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
    public List<Double> averageOfLevels(TreeNode root) {
      List<Double> list = new ArrayList<>();
      if(root==null){
        return list;
      }
      Queue<TreeNode> queue = new LinkedList<TreeNode>();
      queue.offer(root);

      while(!queue.isEmpty()){
             List<Integer> row = new LinkedList<>();
             int levelNum = queue.size();
             for(int i=0;i<levelNum;i++){
                if(queue.peek().left!=null){
                     queue.offer(queue.peek().left);
                }
                if(queue.peek().right!=null){
                     queue.offer(queue.peek().right);
                }
                row.add(queue.poll().val);
             }
             double d = (double) 0;
            double sum =0;
             for(int i=0;i<row.size();i++){
                
                 sum = (double)sum+row.get(i);
                 d = (double)sum/row.size();;
             }
          list.add(d);
      }
      return list;
    }
}