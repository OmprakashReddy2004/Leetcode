class Solution {
    public int findDuplicate(int[] nums) {
         int ans[] = new int[nums.length+1];
         for(int i =0;i<nums.length;i++){
            ans[nums[i]]++;
            if(ans[nums[i]]>1){
                return nums[i];
            }
         }
         return -1;
    }
}
