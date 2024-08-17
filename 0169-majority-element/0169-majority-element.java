class Solution {
    public int majorityElement(int[] nums) {
      int n = nums.length;
      int count=0,candidate =0;
      
      for(int x : nums){
        if(count ==0){
          candidate =x;
        }
        if(x==candidate){
            count++;
        }else{
            count--;
        }
        
      }
      return candidate;
         
    }
}