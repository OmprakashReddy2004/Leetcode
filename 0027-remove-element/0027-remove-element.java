class Solution {
    public int removeElement(int[] nums, int val) {
         int left = 0;
         int right = nums.length-1;
         int count = 0;
         while(left<=right){
            if(nums[left]!=val){
                left++;
                count++;
            }else{
                nums[left] = nums[right];
                right--;
            }
         }
         return count;
    }
}