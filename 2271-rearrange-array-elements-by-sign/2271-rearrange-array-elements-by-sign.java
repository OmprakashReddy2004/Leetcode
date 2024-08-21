class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        for(int x:nums){
            if(x>0){
                pos.add(x);
            }else{
                neg.add(x);
            }
        }
        int index =0;
        for(int i=0;i<n;i+=2){
         nums[i] = pos.get(index++);
        }
        int index2=0;
        for(int i=1;i<n;i+=2){
         nums[i] = neg.get(index2++);
        }
        return nums;
    }
}