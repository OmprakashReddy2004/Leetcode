class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int n = nums.length;
        Map<Integer,Integer> map = new HashMap<>();
        int prefixSum = 0;
        map.put(0,-1);
        for(int right=0;right<n;right++){
            prefixSum += nums[right];
            int rem = prefixSum % k;
            if(map.containsKey(rem)){
                if(right - map.get(rem) >=2){
                    return true;
                }

            }else{
                map.put(rem,right);
            }
            
        }

        return false;
    }
}