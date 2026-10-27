class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n = nums.length;
        int left = 0;
        int right = 0;
        long max = 0;
        long sum = 0;
        Set<Integer> set = new HashSet<>();

        while(right < n){
            if(!set.contains(nums[right])){
                set.add(nums[right]);
                sum+=nums[right];
            }else{
                set.remove(nums[left]);
                sum-=nums[left];
                left++;
                continue;
            }
            if(right - left + 1 == k){
                max = Math.max(max,sum);
                set.remove(nums[left]);
                sum-=nums[left];
                left++;
            }
            right++;
        }

        return max;
    }
}