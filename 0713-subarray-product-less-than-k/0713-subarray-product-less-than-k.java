class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n = nums.length;
        int left = 0;
        int prod = 1;
        int count = 0;
        if(n == 1){
            if(nums[0] < k){
                return 1;
            }else{
                return 0;
            }
        }
        
        if(k == 1 || k == 0){
            return 0;
        }

        for(int right=0;right<n;right++){
            prod *= nums[right];
                while ( prod >= k){
                prod = prod / nums[left];
                 left++;
              }
                count+= right - left + 1;
                 
        }
        return count;
    }
}