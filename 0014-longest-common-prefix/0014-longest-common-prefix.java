class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0){
            return "";
        }
        int prefix = 0;

        while(prefix < strs[0].length()){
            char c = strs[0].charAt(prefix);
        
            for(int i=1;i<strs.length;i++){
                if(prefix >= strs[i].length() || strs[i].charAt(prefix)!=c){
                    return strs[0].substring(0,prefix);
                }
            }
            prefix++;
        }
  

        return strs[0].substring(0,prefix);
    }
}