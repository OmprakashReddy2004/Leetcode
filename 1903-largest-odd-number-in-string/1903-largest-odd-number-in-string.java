class Solution {
    public String largestOddNumber(String num) {
        int n = num.length();

        String s = "";

        for(int i=n-1;i>=0;i--){
            char c = num.charAt(i);
            int number = c - '0';

            if(number%2!=0){
               return num.substring(0,i+1);
            }
        }

         return "";
    }
}