class Solution {
    public String removeStars(String s) {
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)!= '*'){
                sb.append(s.charAt(i));
            }else{
                sb.deleteCharAt(sb.length()-1);
            }
        }

        return sb.toString();
    }
}