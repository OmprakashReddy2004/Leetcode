class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        
        int n = spells.length;
        int m = potions.length;
        int [] ans = new int[n];
        Arrays.sort(potions);
        

        


        for(int i=0;i<n;i++){
            int firstIndex = m;
            int lo = 0;
            int hi = m-1;
            while(lo <= hi){
             int mid = lo + (hi-lo)/2;

             if((long)potions[mid]*spells[i] >= success){
                firstIndex = mid;
                hi = mid - 1;
             }else{
                lo = mid + 1;
             }

             
            }
            ans[i] = m - firstIndex;
            
        }

         

        return ans;
    }
    
}