class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atMost(nums,k) - atMost(nums,k-1);
    }
    public static int atMost(int []nums,int k){
        int left = 0;
        Map<Integer,Integer> map = new HashMap<>();
        int count = 0;
        int n = nums.length;
        for(int right = 0; right < n; right++){
            
            int x = nums[right];
            map.put(x,map.getOrDefault(x,0)+1);

            while(map.size() > k){
                int y = nums[left];
                if(map.containsKey(y)){
                    map.put(y,map.get(y)-1);

                    if(map.get(y) == 0){
                    map.remove(y);
                 }
                }
                 left++;
                 
            }
            count += right - left + 1;
        }
        return count;
    }
}