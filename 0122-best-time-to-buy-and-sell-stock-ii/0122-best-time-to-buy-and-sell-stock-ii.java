class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int max = 0;

        if(n==1) return 0;

        for(int i=0;i<n;i++){
            if(i==n-2){
                break;
            }else if(prices[i]<prices[i+1]){
                max+=prices[i+1] - prices[i];
            }
        }

        if(prices[n-2] < prices[n-1]){
            max+=prices[n-1] - prices[n-2];
        }

        return max;
    }
}