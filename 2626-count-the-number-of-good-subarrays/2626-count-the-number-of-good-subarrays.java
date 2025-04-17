class Solution {
    public long countGood(int[] nums, int k) {
        int left =0;
        long result = 0;
        long currPairs = 0;
        int n = nums.length;

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int right=0;right<n;right++){
            int val = nums[right];
            int freq = map.getOrDefault(val,0);

            currPairs+=freq;

            map.put(val,freq+1);

            while(currPairs>=k){
                result+=n-right;
                int leftval = nums[left];
                int leftFreq = map.get(leftval);

                currPairs-=(leftFreq-1);
                map.put(leftval,leftFreq-1);
                left++;
            }
        }
        return result;
    }
}