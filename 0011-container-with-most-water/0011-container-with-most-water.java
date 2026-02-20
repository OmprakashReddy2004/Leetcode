class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int left = 0;
        int right = n-1;
        int max = Integer.MIN_VALUE;

        while(left<right){
            if(height[left] < height[right]){
                int area = height[left] * (right-left);
                max = Math.max(max,area);
                left++;
            }else{
                int area = height[right] * (right-left);
                max = Math.max(max,area);
                right--;
            }
        }
        return max;
    }
}