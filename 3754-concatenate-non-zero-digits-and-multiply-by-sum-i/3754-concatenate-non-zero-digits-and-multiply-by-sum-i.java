class Solution {
    public long sumAndMultiply(int n) {
        if(n==0) return 0;
        StringBuilder sb = new StringBuilder(Integer.toString(n));
        StringBuilder res = new StringBuilder();
        int sum = 0;
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)!='0'){
                sum+= sb.charAt(i) - '0';
                res.append(sb.charAt(i));
            }
        }
        String ans = res.toString();
        return (long) Integer.valueOf(ans) * sum;
         
    }
}