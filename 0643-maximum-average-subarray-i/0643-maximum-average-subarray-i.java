class Solution {
    public double findMaxAverage(int[] nums, int k) {
       double max = Double.NEGATIVE_INFINITY;
        int left = 0;
        int right = 0;
        int sum = 0;
        while( right < nums.length){
            sum+= nums[right];
            if(right - left + 1 == k){
                max = Math.max(max,(double)sum/k);
                sum -= nums[left];
                left++;
            }
          right++;
        }
        return max;
    }
}