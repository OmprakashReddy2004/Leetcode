class Solution {
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int k = needle.length();
        int left = 0;
        int right =0;

        while(right<n){
            if(right-left+1<k){
                right++;
            }else if(right-left+1==k){
                String s = haystack.substring(left,right+1);
                if(s.equals(needle)){
                    return left;
                }
                right++;
                left++;
            }
        }
          return -1;
    }
}