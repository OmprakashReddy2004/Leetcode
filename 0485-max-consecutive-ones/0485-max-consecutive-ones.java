class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int res =0;
        int n = nums.length;
        int max= 0;
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                res++;
               max=Math.max(res,max);
            }else{
                res=0;
            }
        }
        return max;
    }
}