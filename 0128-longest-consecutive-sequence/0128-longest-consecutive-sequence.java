class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for(int x:nums){
            set.add(x);
        }
        int count = 0;
        int max = 0;

        for(int it:set){

            if(!set.contains(it-1)){
                 count = 1;
                int x = it;

                while(set.contains(x+1)){
                count++;
                x+=1;
            }
            }

           

            max = Math.max(max,count);
        }
        return max;
    }
}