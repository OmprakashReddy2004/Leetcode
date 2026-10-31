class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return countWays(nums,goal) - countWays(nums,goal-1);
    }
    public static int countWays(int [] nums, int k){
        if(k < 0) return 0;
        int count = 0;
        int n = nums.length;

         int left = 0;
         int sum = 0;
         for(int right= 0; right <n ;right++){
            sum+= nums[right];

            while(sum > k){
                sum -= nums[left];
                left++;
            }
            count += right - left + 1;
    }
    return count;
}
}