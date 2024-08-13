class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int count =0;
        int index =0;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                nums[index]=nums[i];
                index++;
            }else{
                count++;
            }
        }
        for(int i=n-1;i>=n-count;i--){
            nums[i] = 0;
        }
    }
}