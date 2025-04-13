class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int max = 0;
 
        for(int i=0;i<n;i++){
            HashSet<Character> set = new HashSet<>();
            for(int j=i;j<n;j++){
                if(set.contains(s.charAt(j))){
                    max = Math.max(set.size(),max);
                    break;
                }else{
                    set.add(s.charAt(j));
                } 
            }
              max = Math.max(set.size(),max);
        }
       
        return max;
    }
}