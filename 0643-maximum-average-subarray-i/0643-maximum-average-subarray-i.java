class Solution {
    public double findMaxAverage(int[] nums, int k) {
         int left = 0;
         int right = 0;
         double sum = 0;
         double max = Integer.MIN_VALUE;

         while(right<nums.length){
            sum+=nums[right];
            int window = right-left+1;

            if(window==k){
                max = Math.max(max,sum/k);
                sum-=nums[left];
                left++;
            }
            right++;
         }
         return max;
    }
}