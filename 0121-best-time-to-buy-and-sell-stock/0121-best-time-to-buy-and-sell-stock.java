class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int left = 0;
        int right = 0;
        int max = 0;

        for(int price : prices){

            if(prices[left] < prices[right]){
                int profit = prices[right] - prices[left];
                max = Math.max(max,profit);
            }else{
                left = right;
            }
            right++;
        }
        return max;
         
          
    }
}