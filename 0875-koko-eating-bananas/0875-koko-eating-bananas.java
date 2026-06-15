class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int lo = 1;
        int hi = 1;

        for(int x : piles){
            hi = Math.max(hi,x);
        }

        while(lo <= hi){

            int mid = lo + (hi - lo)/2;

            long hours = 0;

            for(int pile : piles){
                hours+= (pile + mid - 1)/ mid;
            }

            if(hours <= h){
                hi = mid - 1;
            }else{
                lo = mid + 1;
            }
        }

        return lo;

        
    }
}