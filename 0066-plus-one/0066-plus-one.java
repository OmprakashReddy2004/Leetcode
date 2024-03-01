class Solution {
    public int[] plusOne(int[] digits) {
       int n = digits.length;
        
        // Iterate through the digits array from right to left
        for (int i = n - 1; i >= 0; i--) {
            // Add 1 to the current digit
            digits[i]++;
            
            // If the result is less than 10, we don't need to propagate carry
            if (digits[i] < 10) {
                return digits;
            }
            
            // If the result is 10, set the current digit to 0 and continue to the next iteration
            digits[i] = 0;
        }
        
        // If we reach here, it means all digits were 9s, so we need to add an additional digit
        int[] result = new int[n + 1];
        result[0] = 1; // Set the first digit to 1
        return result;
    }
}