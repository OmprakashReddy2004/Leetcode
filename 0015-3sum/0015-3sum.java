class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        Set<List<Integer>> set = new HashSet<>(); 
        int left = 0;
        int right = n-1;
        for(int i=0;i<n;i++){
            
            left = i+1;
            right = n - 1;

            while(left < right){
                int target = nums[i] + nums[left] + nums[right];
                if(target== 0){
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    set.add(list);
                    left++;
                    right --;
                }else if(target > 0){
                    right --;
                }else{
                    left++;
                }

            }

                 
        }
        return new ArrayList<>(set);
    }
}