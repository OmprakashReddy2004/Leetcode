class Solution {
    public int fib(int n) {
        int [] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return helper(n,dp);
    }
    public static int helper(int n,int[] dp){
        if(n==1){
            return 1;
        }
        if(n==0){
            return 0;
        }
        if(dp[n]!=-1){
            return dp[n];
        }

        dp[n] = helper(n-1,dp) + helper(n-2,dp);
        return dp[n];
    }
}