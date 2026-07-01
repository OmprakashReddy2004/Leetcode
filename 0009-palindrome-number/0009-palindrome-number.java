class Solution {
    public boolean isPalindrome(int x) {
      String s = x + "";
    

    return recurse(s,0);   
      
    }
    public static boolean recurse(String s, int i){
        if(s.charAt(i)!=s.charAt(s.length()-i-1)){
            return false;
        }

        if(i>=s.length()/2){
            return true;
        }

        return recurse(s,i+1);

    }
}