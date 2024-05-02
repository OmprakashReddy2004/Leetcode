class Solution {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
        int result = Integer.MIN_VALUE;
        
        int left = 0;
        int right = nums.length - 1;
        
        while (left <= right) {
            int sum = nums[left] + nums[right];
            
            if (sum == 0) {
                 result = Math.max(result,nums[right]);
                // Move both pointers to find other potential pairs
                left++;
                right--;
            } else if (sum < 0) {
                left++;
            } else {
                right--;
            }
        }
        
        return result == Integer.MIN_VALUE ? -1 : result;
    }
}
