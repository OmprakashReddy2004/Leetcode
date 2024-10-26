class Solution {
    public int uniquePaths(int m, int n) {
        int dp[][] = new int[m][n];
        for(int i=0;i<m;i++){
            Arrays.fill(dp[i],-1);
        }
        int count = helper(m,n,0,0,dp);
        return count;
    }
    public static int helper(int m,int n,int row,int col,int[][]dp){
        if(row>= m|| col>=n ){
            return 0;
        }
        if(row ==m-1 && col==n-1){
             return 1;
        }
        if(dp[row][col]!=-1){
            return dp[row][col];
        }

        int down = helper(m,n,row+1,col,dp);
        int right = helper(m,n,row,col+1,dp);
        dp[row][col] = right + down;
        return dp[row][col];
    }
}