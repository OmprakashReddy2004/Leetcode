class Solution {
    public long countSubarrays(int[] nums, int k) {
       long count = 0;
        int n = nums.length;

        int max = Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            max = Math.max(max,nums[i]);
        }

        int left = 0;
        int countMax = 0;

        for(int right=0;right<n;right++){
            if(nums[right] == max){
                countMax++;
            }
               while(countMax>=k){
                count+=n-right;
                   if(nums[left]==max){
                    countMax--;
                   }
                   left++;
               }

        }
        return count;
    }
}