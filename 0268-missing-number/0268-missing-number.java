class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
          int sum1=0;
          int sum2=0;
         for(int i=0;i<n+1;i++){
             sum1+=i;
         }
          for(int i=0;i<n;i++){
             sum2+=nums[i];
         }
         return Math.abs(sum1-sum2);
          

    }
}