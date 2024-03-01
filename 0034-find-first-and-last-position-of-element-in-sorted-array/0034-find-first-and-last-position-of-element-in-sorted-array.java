class Solution {
    public int[] searchRange(int[] nums, int target) {
        int result [] = new int[]{-1,-1};
        int left = 0;
        int right = nums.length-1;
        int result1 = -1;
        int result2 = -1;
        while(left<=right){
            int mid = left +(right-left)/2;
            if(nums[mid]==target){
                result1=mid;
                right=mid-1;
            } else if(nums[mid]<target){
                left = mid+1;
            } else{
                right = mid-1;
            }
        }
        left =0;
        right = nums.length-1;
         while(left<=right){
            int mid = left +(right-left)/2;
            if(nums[mid]==target){
                result2=mid;
                left = mid+1;
            } else if(nums[mid]<target){
                left = mid+1;
            } else{
                right = mid-1;
            }
        }
        result[0] = result1;
        result[1] = result2;
        return result;
    
            }
}