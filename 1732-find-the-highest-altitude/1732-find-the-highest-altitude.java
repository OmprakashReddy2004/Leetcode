class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
         

         
        int max = 0;

        int temp = 0;

         for(int i=1;i<=n;i++){
            temp = temp + gain[i-1];
            max = Math.max(max,temp);
         }

        return max;

        
    }
}