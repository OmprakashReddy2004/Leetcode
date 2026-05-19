class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int n = nums.length;
        int curr_sum = 0;

         for(int sum : nums){
            if(curr_sum<0){
                curr_sum = 0;
            }
            curr_sum+=sum;
            max = Math.max(max,curr_sum);
         }

        return max;
    }
}