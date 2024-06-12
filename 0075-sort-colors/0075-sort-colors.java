class Solution {
    public void sortColors(int[] nums) {
        int count_0 = 0, count_1 = 0, count_2 = 0;
      for (int x : nums) {
            if (x == 0) {
                count_0++;
            } else if (x == 1) {
                count_1++;
            } else {
                count_2++;
            }
        }
       int i = 0;
       while (count_0 > 0) {
            nums[i++] = 0;
            count_0--;
        }
        while (count_1 > 0) {
            nums[i++] = 1;
            count_1--;
        }
       while (count_2 > 0) {
            nums[i++] = 2;
            count_2--;
        }
    }
}