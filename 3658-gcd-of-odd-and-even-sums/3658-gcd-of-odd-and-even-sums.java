class Solution {
    public int gcdOfOddEvenSums(int n) {
         int oddSum = 0;
         int evenSum = 0;
         int oddCount = 0;
         int evenCount = 0;

         int num = 1;

         while(oddCount < n || evenCount < n){
            if(num % 2 ==0 && evenCount < n){
                evenCount++;
                evenSum+=num;
            }else if(num%2!=0 && oddCount < n){
                oddCount++;
                oddSum+=num;
            }
            num++;

         }

         return gdc(evenSum,oddSum);
    }
    public static int gdc ( int a, int b){
        while(b!=0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}