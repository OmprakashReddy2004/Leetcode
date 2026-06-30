class Solution {
    public int numberOfSubstrings(String s) {
        int count = 0;
        int n = s.length();

        int lo = 0;
        int hi = 0;

        while(hi < n){

             
            String substr = s.substring(lo,hi+1);
            if(substr.contains("a") && substr.contains("b") && substr.contains("c")){
                count+= n - hi;
                lo++;
            }else{
                  hi++;
            }
          

            
            
        }
        return count;
    }
}