class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);

        int n = nums.length;
        long count = 0;
        for(int i=0;i<n;i++){
            
            int lo = i + 1;
            int hi = n - 1;
            int firstIndex = -1;
            int lastIndex = -1;

            while(lo<=hi){
                int mid = lo + (hi-lo)/2;

                if(nums[mid] + nums[i] >= lower ){
                    firstIndex = mid;
                    hi = mid - 1;
                 }else{
                    lo = mid + 1;
                 }
            }
             

            lo = i + 1;
            hi = n - 1;

            while(lo <= hi){
                int mid = lo + (hi-lo)/2;

                if(nums[mid] + nums[i] <= upper){
                    lastIndex = mid;
                    lo = mid + 1;
                }else{
                    hi = mid - 1;
                }
            }

            if(firstIndex != - 1 && lastIndex !=-1 && firstIndex<=lastIndex){
                count+= lastIndex - firstIndex + 1;
            }
            

        }
        return count;
    }
}