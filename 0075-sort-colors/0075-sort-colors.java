class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int mid = 0;
        int low =0;
        int high = n-1;

        while(mid<=high){
            if(nums[mid]==0){ // should swap with low
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            }else if(nums[mid]==2){// should swap with high
                int temp = nums[high];
                nums[high] = nums[mid];
                nums[mid] = temp;
                high--;
            }else{
                mid++;
            }
        }

    }
}