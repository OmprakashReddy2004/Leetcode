class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;

        if ((long)m*k > n) return -1;
        int lo = 1;
        int hi = 1;
        
        for(int x : bloomDay){
            hi = Math.max(x,hi);
            lo = Math.min(x,lo);
        }

       

        while(lo <= hi){
            int mid = lo + (hi - lo)/2;

            if(canMake(bloomDay,m,k,mid)){
                hi = mid - 1;
            }else{
                lo = mid + 1;
            }
        }
        return lo;


    }
    public static boolean canMake(int [] nums,int m,int k,int mid){
        int bouquets = 0;
        int consecutive = 0;

        for(int x : nums){
            if(x<=mid){
                consecutive++;

                if(consecutive == k){
                    bouquets++;
                    consecutive = 0;
                }
            }
            else{
                    consecutive = 0;
                }
            if(bouquets>=m) return true;
        }

        return false;
    }
}