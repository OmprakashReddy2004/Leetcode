class Solution {
    public int splitArray(int[] nums, int k) {
        int lo = 1;
        int hi = 0;
        int ans = 0;

        for(int x : nums){
            lo = Math.max(lo,x);
            hi += x;
        }

        while(lo <= hi){
            int mid = lo + (hi - lo)/2;

            if(canSplit(nums,mid,k)){
                ans = mid;
                hi = mid - 1;
            }else{
                lo = mid + 1;
            }
        }
        return ans;
    }
    public static boolean canSplit(int [] nums,int mid,int k){
        int subArrays = 1;
        int sum = 0;

        for(int x : nums){
            
            if(sum + x > mid){
                subArrays++;
                sum = x;
            }else{
                sum+=x;
            }
        }
        if(subArrays<=k) return true;
        return false;
    }
}