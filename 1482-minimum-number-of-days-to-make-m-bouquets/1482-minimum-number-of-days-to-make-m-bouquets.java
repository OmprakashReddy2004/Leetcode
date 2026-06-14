class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int min = Integer.MAX_VALUE;
         int max = Integer.MIN_VALUE;
        if ((long) m * k > bloomDay.length) return -1;
        for(int x : bloomDay){
            min = Math.min(min,x);
            max = Math.max(max,x);
        }

        int lo = min;
        int hi = max;

        while(lo <= hi){
            int mid = lo + (hi - lo)/2;

                if(validate(bloomDay,m,k,mid)){
                    hi = mid - 1;
                }else{
                    lo = mid + 1;
                }
            
        }
            return lo;

    }
    public static boolean validate(int []bloomDay,int m, int k,int mid){
        int bouquets = 0;
        int consecutive = 0;

        for(int i=0;i<bloomDay.length;i++){
            
            if(bloomDay[i] <= mid){
                consecutive++;

                if(consecutive == k){
                   bouquets++;
                    consecutive = 0;
                }
            }else{
                consecutive = 0;
            }
        }
         return bouquets>=m;
    }
}