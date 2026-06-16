class Solution {
    public int maximumCandies(int[] candies, long k) {
        
        long sum = 0;
        long max = 0;

        for(int x : candies){
            sum+=x;
            max = Math.max(max,x);
        }

        if(k > sum) return 0;

        long lo = 1;
        long hi = max;
        long ans = 0 ;

        while( lo <= hi){
            long mid = lo + (hi - lo)/2;

            if(maxAllocate(candies,mid,k)){
                ans = mid;
                lo = mid + 1;
            }else{
                hi = mid - 1;
            }
        }
        return (int)ans;


    }
    public static boolean maxAllocate(int [] nums,long mid,long k){
        long allocate = 0;

        for(int x : nums){
            
            allocate+= x/mid; 
            if(allocate>=k) return true;
        }

        
        return false;
    }

}