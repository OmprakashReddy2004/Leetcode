class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n = obstacleGrid.length;
        int m = obstacleGrid[0].length;
        int [][] dp = new int[n][m];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
         if (obstacleGrid[0][0] == 1 || obstacleGrid[n - 1][m - 1] == 1) {
            return 0;
        }
        int res = helper(obstacleGrid,0,0,dp);
        return res;
    }
    public static int helper(int [][]matrix,int row,int col,int[][]dp){
        if(row==matrix.length-1 && col==matrix[0].length-1){
            return 1;
        }
       if (row >= matrix.length || col >= matrix[0].length || matrix[row][col] == 1) {
            return 0;
        }   
        if(dp[row][col]!=-1){
            return dp[row][col];
        }
        
        int down = helper(matrix,row+1,col,dp);
        int right = helper(matrix,row,col+1,dp);
          dp[row][col] = down + right;
        return dp[row][col];
    }
}