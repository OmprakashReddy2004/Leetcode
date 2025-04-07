class Solution {
    public int findMaxLength(int[] nums) {
        int max = 0;
        int n = nums.length;

         HashMap<Integer,Integer> map = new HashMap<>();
         map.put(0,-1);
        int sum = 0;
         for(int i=0;i<n;i++){
            if(nums[i]==0){
                sum+= -1;
            }else if(nums[i]==1){
                sum+= 1;
            }

            if(map.containsKey(sum)){
                int idx = map.get(sum);
                int len = i - idx;
                if(len > max){
                    max = len;
                }
            }else{
                map.put(sum,i);
            }
         }
         return max;
    }
}