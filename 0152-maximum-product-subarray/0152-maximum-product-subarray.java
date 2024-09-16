class Solution {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        int prefix = 1;
        int suffix = 1;
        for(int i=0;i<nums.length;i++){
            prefix*=nums[i];
            suffix*=nums[nums.length-1-i];
            max = Math.max(max,Math.max(prefix,suffix));
            if(prefix==0){
                prefix = 1;
            }else if(suffix==0){
                suffix = 1;
            }

        }
        return max;
    }
}