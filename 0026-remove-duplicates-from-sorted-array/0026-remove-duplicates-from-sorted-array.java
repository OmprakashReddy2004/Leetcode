class Solution {
    public int removeDuplicates(int[] nums) {
        int left = 0;
        int count = 0;

        for(int right =1;right<nums.length;right++){
            if(nums[left]!=nums[right]){
                left+=1;
                nums[left] = nums[right];
                count++;
            }
        }
        return ++count;
    }
}