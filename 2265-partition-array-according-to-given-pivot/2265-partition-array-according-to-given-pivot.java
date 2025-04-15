class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        int [] res = new int[nums.length];
        int i = 0;
         
         for(int x:nums){
            if(x<pivot){
                res[i++] = x;
            }
         }
         for(int x:nums){
            if(x==pivot){
                res[i++] = x;
            }
         }

         for(int x : nums){
            if(x>pivot){
                res[i++] = x;
            }
         }
         
         return res;
    }
}