class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int num = nums[i];
            if (map.containsKey(num) && (i-map.get(nums[i])<=k)) {
                return true;
                
            } else {
                 
                 map.put(nums[i],i);
            }
        }
        return false;
         
    }
}