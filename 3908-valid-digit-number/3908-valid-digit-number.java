class Solution {
    public boolean validDigit(int n, int x) {
        String s1 = String.valueOf(n);
        String s2 = String.valueOf(x);

        Boolean occurrence = s1.contains(s2);
        Boolean startWith = s1.charAt(0) != s2.charAt(0);
        
        
       return occurrence && startWith;

    }
}