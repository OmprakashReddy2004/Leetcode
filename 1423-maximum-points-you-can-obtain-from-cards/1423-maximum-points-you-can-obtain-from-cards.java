class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int total = 0;
        int w = n - k;
        int min = Integer.MAX_VALUE;

         int left = 0;
         int right = 0;
         int sum = 0;

         while(right < n){
            total+=cardPoints[right];
            sum+=cardPoints[right];

            if(right - left + 1 == w){
                min = Math.min(min,sum);
                sum-=cardPoints[left];
                left++;
            }

            right++;
         }
         if(n==k) return total;
         return total - min;

    }
}