class Solution {
    public List<Integer> findValidElements(int[] nums) {
        List<Integer> list = new ArrayList<>();
        list.add(nums[0]);
        int n = nums.length;
        
        for(int i=1;i<n-1;i++){

            if(leftCheck(0,i,nums[i],nums) || rightCheck(i+1,n,nums[i],nums)){
                list.add(nums[i]);
            }
        }
        if(n>1) list.add(nums[n-1]);
        
        return list;
    }
    public static boolean leftCheck(int left,int right,int valid,int[] nums){
        for(int i=left;i<right;i++){
            if(nums[i]>=valid){
                return false;
            }

        }
        return true;
    }
    public static boolean rightCheck(int left,int right,int valid,int nums[]){
        for(int i=left;i<right;i++){
            if(nums[i]>=valid){
                return false;
            }

        }
        return true;
    }
}