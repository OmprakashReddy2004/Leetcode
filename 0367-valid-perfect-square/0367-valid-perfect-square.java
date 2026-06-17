class Solution {
    public boolean isPerfectSquare(int num) {
        int lo = 1;
        int hi = num/2;

        if(num == 1) return true;

        while(lo <= hi){
             int mid = lo + (hi-lo)/2;

            if((long)mid * mid == num){
                return true;
            }else if((long)mid * mid > num){
                hi = mid - 1;
            }else{
                lo = mid + 1;
            }
        }
        return false;
    }
}