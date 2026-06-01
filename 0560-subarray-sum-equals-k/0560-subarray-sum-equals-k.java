class Solution {
    public int subarraySum(int[] nums, int k) {
          
           HashMap<Integer,Integer> map = new HashMap<>();
           map.put(0,1);
           int curr_sum = 0;
           int count = 0;

            for(int x : nums){
                curr_sum+=x;

                if(map.containsKey(curr_sum - k)){
                    count+=map.get(curr_sum -  k);
                }
                map.put(curr_sum,map.getOrDefault(curr_sum,0)+1);
            }

            return count;
    }
}