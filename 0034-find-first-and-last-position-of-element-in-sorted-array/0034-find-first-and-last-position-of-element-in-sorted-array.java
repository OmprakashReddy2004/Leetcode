class Solution {
    public int[] searchRange(int[] nums, int target) {
        int result [] = new int[]{-1,-1};
        int left = 0;
        int right = nums.length-1;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(nums[mid]==target){
                int start = mid;
                int end = mid;
                while(start>0 && nums[start-1]==target){
                    start--;
                }
                while(end<nums.length-1 && nums[end+1]==target){
                    end++;
                }
                result[0] = start;
                result[1] = end ;
            }
            if(target<nums[mid]){
            
                right = mid-1;
            } else{
              
               left = mid + 1;
            }
        }
        return result;
            }
}