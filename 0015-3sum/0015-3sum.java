class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int left = 0;
        int right = n-1;
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0;i<n;i++){
            
            if(i!=0 && nums[i]==nums[i-1]){
                continue;
            }
            left = i+1;
            right = n - 1;

            while(left < right){
                int target = nums[i] + nums[left] + nums[right];
                if(target== 0){
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[left]);
                    list.add(nums[i]);
                    list.add(nums[right]);
                    res.add(list);
                    left++;
                    right --;
                    while(left < right && nums[left] == nums[left-1]){
                        left++;
                    }
                    while(left < right && nums[right] == nums[right+1]){
                        right--;
                    }
                }else if(target > 0){
                    right --;
                }else{
                    left++;
                }

            }

                 
        }
        return res;
    }
}