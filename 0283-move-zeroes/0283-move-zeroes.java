class Solution {
    public void moveZeroes(int[] nums) {
        if (nums.length < 2) return;

        int left = 0;
        int right = 1;

        while (right < nums.length) {

            if (nums[left] == 0 && nums[right] != 0) {
                swap(nums, left, right);
                left++;
                right++;
            } 
            else if (nums[left] == 0 && nums[right] == 0) {
                right++;
            } 
            else {  
                left++;
                if (left == right) right++;
            }
        }
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
