class Solution {
    public int minMoves(int[] nums) {
        int max = 0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            max = Math.max(nums[i],max);
        }
        int count = 0;

        for(int x : nums){
            count += max - x;
        }
        return count;
    }
}