class Solution {
    public int countCompleteDayPairs(int[] hours) {
 
        int count =0;
       for(int i=0;i<hours.length;i++){
          for(int j=i+1;j<hours.length;j++){
             int cal = (hours[i] + hours[j]) % 24;
              if(cal==0){
                  count++;
              }
          }
       }
        return count;
    }
}