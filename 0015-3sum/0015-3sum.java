class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();
        for(int i=0;i<n-2;i++){

            int left = i + 1;
            int right = n-1;

            while(left < right){
                int sum = nums[left] + nums[i] + nums[right];
                if(sum == 0){
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[left]);
                    list.add(nums[right]);
                    list.add(nums[i]);
                    set.add(list);
                    left++;
                    right--;
                }else if(sum < 0){
                    left++;
                }else{
                    right --;
                }
            }
        }
        return new ArrayList<>(set);
    }
}