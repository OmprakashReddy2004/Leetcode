class Solution {
    public int mySqrt(int x) {
        int lo = 1;
        int hi = x;
        int ans = 0;
        if(x == 0) return x;

        while(lo <= hi){
             int mid = lo + (hi-lo)/2;

             if(mid <= x / mid ){
                ans = mid;
                lo = mid + 1;
             }else{
                hi = mid - 1;
             }
        
    }
   return ans;
}
}