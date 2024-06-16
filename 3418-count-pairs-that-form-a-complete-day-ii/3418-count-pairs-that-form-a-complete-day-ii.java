 class Solution {
    public long countCompleteDayPairs(int[] hours) {
         int freq[] = new int[24];
           int n = hours.length;
           long count = 0;
           for(int x : hours){
            int r = x % 24;
            if(r==0){
                count+=freq[0];
            }else{
                count+=freq[24-r];
            }
            freq[r]++;
           }
           
    return  count;
    
  }
 }
