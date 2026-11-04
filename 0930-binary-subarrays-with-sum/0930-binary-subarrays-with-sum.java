class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        Map<Integer,Integer> map = new HashMap<>();
        int prefixSum = 0;
        int count = 0;

        for(int i = 0; i < nums.length; i++){
            prefixSum += nums[i];

            if(prefixSum == goal) count++;

            int target = prefixSum - goal;
            if(map.containsKey(target)){
                count += map.get(target);
            }
            map.put(prefixSum, map.getOrDefault(prefixSum,0)+1);
        }

        return count;
    }
}