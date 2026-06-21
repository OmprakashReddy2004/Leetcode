class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);

        int max = 0;
        int count = 0;
        for(int x : costs){
            if(count + x <= coins){
                count+=x;
                max++;
            }
        }
        return max;
    }
}