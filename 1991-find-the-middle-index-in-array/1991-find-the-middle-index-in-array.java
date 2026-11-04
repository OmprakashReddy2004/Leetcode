class Solution {
    public int findMiddleIndex(int[] nums) {

        int n = nums.length , totalSum = 0,leftSum = 0, rightSum = 0;
        for(int x : nums){
            totalSum += x;
        }

        for(int i = 0; i < n; i++){
            rightSum = totalSum - leftSum - nums[i];
            if(leftSum == rightSum){
                return i;
            }
            leftSum += nums[i];
        }
        
        return -1;
    }
}