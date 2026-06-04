class Solution {
    public int minimumSwaps(int[] nums) {
        int ans = 0;
        
        int left = 0;
        int right = nums.length-1;

        while(left<=right){
            if(nums[left]==0 && nums[right]!=0){
                swap(nums,left,right);
                left++;
                right--;
                ans++;
            }else if(nums[left]==0 && nums[right]==0){
                right--;
            }
            else if (nums[left] != 0) {
                 
                left++;
            }
             
             
        }

        return ans;

    }
    public static void swap(int [] nums, int left, int right){
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}