class Solution {
    public int lengthOfLongestSubstring(String s) {
         String ans= "";
         for(int i=0;i<s.length();i++){
            String res = "";
            for(int j=i;j<s.length();j++){
                 char c = s.charAt(j);
                 if(!res.contains(String.valueOf(c))){
                    res = res + c;
                 }else{
                    break;
                 }
            }
            if(res.length()>ans.length()){
                ans = res;
            }
         }
         return ans.length();
    }
}