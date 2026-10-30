class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int n = nums.length;
        int count = 0;
        Map<Integer,Integer> map = new HashMap<>();

        map.put(0,1);
        int prefixSum = 0;
        for(int right = 0; right < n; right++){
            prefixSum +=nums[right];
            int target = prefixSum % k;
            if(target < 0){
                target+=k;
            }
            if(map.containsKey(target)){
                count+= map.get(target);
            }
            map.put(target,map.getOrDefault(target,0)+1);
            
            
        }
        return count;
    }
}