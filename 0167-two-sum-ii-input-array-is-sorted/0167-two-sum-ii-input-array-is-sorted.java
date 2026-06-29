class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;

        int lo = 0;
        int hi = n-1;

        while(lo < hi){
            if(numbers[lo] + numbers[hi] == target){
                return new int[]{lo+1,hi+1};
            }else if (numbers[lo] + numbers[hi] > target){
                hi--;
            }else{
                lo++;
            }
        }

        return new int[]{-1,-1};
    }
}