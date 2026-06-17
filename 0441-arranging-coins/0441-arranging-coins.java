class Solution {
    public int arrangeCoins(int n) {
        long lo = 0;
        long hi = n;
        int ans = 0;
        while(lo <= hi){
            long mid = lo + (hi-lo)/2;

            if(canBuild(mid,n)){
                ans = (int) mid;
                lo = mid + 1;
            }else{
                hi = mid - 1;
            }
        }
        return ans;
    }
    private boolean canBuild(long mid, int n) {
        return mid * (mid + 1) / 2 <= n;
    }

}