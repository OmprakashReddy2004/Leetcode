class Solution {
    public int minimizeMax(int[] nums, int p) {
        Arrays.sort(nums);
        int n = nums.length;
        int lo = 0;
        int hi = nums[n-1] - nums[0];
        int ans = 0;


        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(pairs(nums,mid,p)){
                ans = mid;
                hi = mid - 1;
             }else{
                lo = mid + 1;
             }
        }
        return ans;
    }
    public static boolean pairs(int [] nums,int mid,int p){
        int count = 0;

        for(int i=1;i<nums.length;i++){
            if(nums[i] - nums[i-1] <=mid){
                count++;
                i++;
            }

            if(count>=p){
                return true;
            }
        }

       return false;
    }
}