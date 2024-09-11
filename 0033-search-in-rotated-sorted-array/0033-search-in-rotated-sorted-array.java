class Solution {
    public int search(int[] nums, int target) {
         // array will be rotated. so check left side sorted part first.if found return it.
         // check right side sorted part.
         int left =0;
         int right = nums.length - 1;
         while(left<=right){
            int mid = left + (right-left)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid]>=nums[left]){ // left part is sorted.
                if(nums[left]<=target && target<=nums[mid]){
                   right = mid -1;
                }else{
                   left = mid + 1;
                 }
            }
            else{
                if(target>=nums[mid] && target<=nums[right]) {     // check right part.
                   left = mid + 1;
                 }else{
                    right = mid - 1;
                 }
         }
        
    }
     return -1;
}
}