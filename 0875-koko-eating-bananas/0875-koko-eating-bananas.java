class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 1;

        for (int x : piles) {
            max = Math.max(max, x);
        }
        int left = 1;
        int right = max;
         while(left<=right){
          int mid = left + (right-left)/2;
           long hours = 0;                        

            for(int p : piles){
                hours+= (int) Math.ceil(((double) p/mid)); 
            }

            if(hours<=h){
                right = mid - 1;
            }else{
                left = mid + 1;
            }

             
         }
            
        

       return left;
        }
        
    }

