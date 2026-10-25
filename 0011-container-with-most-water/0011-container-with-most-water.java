class Solution {
    public int maxArea(int[] height) {
        int lo = 0;
        int hi = height.length - 1;
        int maxArea = 0;
        while(lo <= hi){
           int tempArea = Math.min(height[lo],height[hi]);
            maxArea = Math.max((tempArea * (hi - lo)),maxArea);

            if(height[lo]<= height[hi]){
                lo++;
            }else{
                hi--;
            }
        }
        return maxArea;
    }
}