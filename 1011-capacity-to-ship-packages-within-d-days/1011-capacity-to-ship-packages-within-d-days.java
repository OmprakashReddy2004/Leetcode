class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int lo = 0;
        int hi = 0;

        for(int x : weights){
            hi+=x;
            lo = Math.max(lo,x);
        }

        while(lo < hi){
            int mid = lo + (hi-lo)/2;

            if(canShip(weights,days,mid)){
                hi = mid;
            }else{
                lo = mid + 1;
            }
        }
        return lo;
    }
    private static boolean canShip(int [] weights,int days,int mid){
        int daysNeeded = 1;
        int sum = 0;

            for(int w : weights){

                if(sum + w > mid){
                    daysNeeded++;
                    sum = 0;
                }
                sum+=w;
            }

        return daysNeeded<=days;
    }
}