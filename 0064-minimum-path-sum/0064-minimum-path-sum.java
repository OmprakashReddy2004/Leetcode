class Solution {
    public static int helper(int i, int j,int[][] dp ,int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
      if (i == n - 1 && j == m - 1) {
            return grid[i][j];
        }
        
      
        if (i >= n || j >= m) {
            return Integer.MAX_VALUE;
        }
        if(dp[i][j]!=0){
            return dp[i][j];
        }
         
        int down = helper(i + 1, j,dp, grid);
        int right = helper(i, j + 1,dp, grid);
        
        
        dp[i][j] = grid[i][j] + Math.min(down, right);
        return dp[i][j];
    }

    public int minPathSum(int[][] grid) {
        int [][] dp = new int[grid.length][grid[0].length];
        return helper(0,0,dp,grid);  
    }
}
