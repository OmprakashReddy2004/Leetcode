class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;

        int [] ans = new int[n];
        int leftSum = 0;
        int rightSum = 0;
        int total = 0;
        for(int i=0;i<n;i++){
            total += nums[i];
        }
        for(int i=0;i<n;i++){
            rightSum = total - leftSum - nums[i];
            ans[i] = Math.abs(leftSum - rightSum);
            leftSum += nums[i];
        }

        return ans;
    }
}