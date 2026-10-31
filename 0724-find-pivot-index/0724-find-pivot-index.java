class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;

        for(int i=0; i<n; i++){
            int sum1 = 0;
            int sum2 = 0;
            for(int j=0;j<i;j++){
                sum1+= nums[j];
                
            }
            for(int k=i+1; k <n; k++){
                sum2+= nums[k];
             }

             if(sum1 == sum2){
                return i;
             }
        }
        return -1; 
    }
}