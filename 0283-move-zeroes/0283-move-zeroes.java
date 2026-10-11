class Solution {
    public void moveZeroes(int[] nums) {

        List<Integer> list = new ArrayList<>();

        for(int x : nums){
            if(x!=0){
                list.add(x);
            }
        }
        for(int x : nums){
            if(x==0){
                list.add(x);
            }
        }

         for(int i=0;i<nums.length;i++){
            nums[i] = list.get(i);
         }
    }
}