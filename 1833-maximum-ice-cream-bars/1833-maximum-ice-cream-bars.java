class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int maxCost = 0;
        for(int x : costs){
            maxCost = Math.max(maxCost,x);
        }

        int [] freq = new int[maxCost+1];

        for(int cost : costs){
            freq[cost]++;
        }

        int bars = 0;

        for(int price=1;price<=maxCost;price++){

            while(freq[price]>0 && coins >=price){
                bars++;
                coins-=price;
                freq[price]--;
            }
        }

        return bars;
    }
}