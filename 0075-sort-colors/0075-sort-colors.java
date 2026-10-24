class Solution {
    public void sortColors(int[] nums) {
        int lo = 0;
        int mid = 0;
        int hi = nums.length - 1;

        while(mid <= hi){

            if(nums[mid]==0){
                int temp = nums[lo];
                nums[lo] = nums[mid];
                nums[mid] = temp;
                lo++;
                mid++;
            }else if(nums[mid]==2){
                int temp = nums[hi];
                nums[hi] = nums[mid];
                nums[mid] = temp;
                hi--;
            }else{
                mid++;
            }
        }

    }
}