class Solution {
    public int maxArea(int[] height) {
        int max = Integer.MIN_VALUE;
         int n = height.length;
        
         int left = 0;
         int right = n-1;

         while(left<=right){
            max = Math.max(max,Math.abs(right-left)*Math.min(height[left],height[right]));

            if(height[left]>height[right]){
                right--;
            }else{
                left++;
            }
         }
         return max;
    }
}