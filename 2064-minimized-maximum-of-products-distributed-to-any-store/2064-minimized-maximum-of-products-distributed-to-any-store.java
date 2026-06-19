class Solution {
    public int minimizedMaximum(int n, int[] quantities) {
        int lo = 1;
        int hi = -1;

        for(int x : quantities){
            hi = Math.max(hi,x);
        }
        int ans = 0;
        while(lo <= hi){
            int mid = lo + (hi-lo)/2;

            if(findX(quantities,mid,n)){
                ans = mid;
                hi = mid - 1;
            }else{
                lo = mid + 1;
            }
        }
        return ans;
    }
    public static boolean findX(int [] quantities,int mid,int n){
        int storesNeeded = 0;

        for(int x : quantities){
            storesNeeded+= (x + mid - 1)/ mid;

            if(storesNeeded > n) return false;
        }

        return true;
    }

}