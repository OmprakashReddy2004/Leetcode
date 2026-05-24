class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = Integer.MIN_VALUE;

        while(left < right){
            int area = Math.abs(left - right) * Math.min(height[left],height[right]);
            max = Math.max(max,area);

            if(height[left] <= height[right]){
                left++;
            }else{
                right--;
            }
        }
        return max;
    }
}