class Solution {
    public String longestPalindrome(String s) {
       int n = s.length();
       String max = "";
       if(s.length()==1){
        return s;
       }
       for(int i=0;i<n;i++){
             for(int j=i+1;j<=n;j++){
                String str = s.substring(i,j);
                String st = helper(str);
                if(st.length()>max.length()){
                    max = st;
                }
             }
       }
       return max;
    }
    public static String helper(String str){
        int left= 0;
        int right = str.length()-1;

        while(left<right){
            if(str.charAt(left)==str.charAt(right)){
                left++;
                right--;
            }else{
               return "";
            }
        }
        return str;
    }
}