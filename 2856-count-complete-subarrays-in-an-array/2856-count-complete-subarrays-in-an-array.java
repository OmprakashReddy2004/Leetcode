class Solution {
    public int countCompleteSubarrays(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        for(int x : nums){
            set.add(x);
        }
         int n = set.size();

         for(int i=0;i<nums.length;i++){
             HashSet<Integer> set1 = new HashSet<>();
              for(int j=i;j<nums.length;j++){
                 set1.add(nums[j]);
                 if(set1.size()==n){
                  count++;
                  }
              }
               
         }

         return count;
    }
    
}