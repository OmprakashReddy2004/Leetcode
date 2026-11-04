class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        int count = 0;
        int prefixSum = 0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]%2!=0){
                prefixSum+=1;
            }

            if(prefixSum == k){
                count++;
            }
            int target = prefixSum - k;
            if(map.containsKey(target)){
                count += map.get(target);
            }
            map.put(prefixSum,map.getOrDefault(prefixSum,0)+1);

        }
        return count;
    }
}