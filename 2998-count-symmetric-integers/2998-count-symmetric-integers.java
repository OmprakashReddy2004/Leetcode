class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;
        for (int i = low; i <= high; i++) {
            String s = String.valueOf(i);
            int n = s.length();
            
             
            if (n % 2 != 0) {
                continue;
            }

           
            String s1 = s.substring(0, n / 2);
            String s2 = s.substring(n / 2, n);

            int res1 = helper(s1);
            int res2 = helper(s2);

            if (res1 == res2) {
                count++;
            }
        }
        return count;
    }

    public static int helper(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += Character.getNumericValue(s.charAt(i));
        }
        return sum;
    }
}
