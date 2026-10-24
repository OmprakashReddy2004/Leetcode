class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length == 1) return;
        int lo = 0;
        int hi = 1;

        while(hi < nums.length){

            if(nums[lo] ==0 && nums[hi]!=0){
                int temp = nums[lo];
                nums[lo] = nums[hi];
                nums[hi] = temp;
                lo++;
            }else if(nums[lo]!=0) {
               lo++;
            }
            hi++;
        }

    }
}