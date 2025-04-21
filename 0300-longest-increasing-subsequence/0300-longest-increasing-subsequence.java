class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
       Integer [][]dp = new Integer[n][n+1];
        return helper(0, -1, nums,dp);
    }

    public static int helper(int curr, int prev, int[] nums,Integer dp[][]) {
        if (curr == nums.length) return 0;

        if(dp[curr][prev+1]!=null) return dp[curr][prev+1];

        int notTake = helper(curr + 1, prev, nums,dp);
        int take = 0;

        if (prev == -1 || nums[curr] > nums[prev]) {
            take = 1 + helper(curr + 1, curr, nums,dp);
        }

        return  dp[curr][prev+1] = Math.max(take, notTake);
    }
}
