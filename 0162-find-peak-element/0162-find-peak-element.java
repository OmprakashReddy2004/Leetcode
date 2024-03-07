 class Solution {
    public int findPeakElement(int[] nums) {
      int n = nums.length;
       int left = 0;
       int right = n-1;
        if(n==1){
            return 0;
        }
        
        while(left<=right){
            int mid = left+(right-left)/2;
            if(mid==0){
                if(nums[0]>nums[1]){
                    return 0;
                }else{
                    return 1;
                }
            }else if(mid==n-1){
                if(nums[n-1]>nums[mid-2]){
                    return n-1;
                }else{
                    return n-2;
                }
            }      
            if(mid>0 && mid<n-1){
                    if(nums[mid]>nums[mid+1] && nums[mid]>nums[mid-1]){
                        return mid;
                    }else if(nums[mid-1]>nums[mid]){
                        right = mid-1;
                    }else{
                        left = mid + 1;
                    }
                }
        

        }   
        return -1;
    

    }
}
