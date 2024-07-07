class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int count =numBottles;
        boolean bool = true;
         
        while(numBottles >= numExchange){
            int newBottles = numBottles / numExchange;
            int cal = numBottles % numExchange;
            
             count+=newBottles;
            numBottles=newBottles+cal;
           
             
        }
        return count;
    }
}