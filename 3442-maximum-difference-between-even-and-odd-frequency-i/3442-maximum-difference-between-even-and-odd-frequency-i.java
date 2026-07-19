class Solution {
    public int maxDifference(String s) {
        int max_odd = 0;
        int min_even = Integer.MAX_VALUE;
        int n = s.length();
        boolean valid [] = new boolean[26];

        for(int i=0;i<n;i++){
            int freqCount = 0;
            char c = s.charAt(i);
            if(valid[c-'a']){
                continue;
            }
            valid[c-'a'] = true;
            for(int j=0;j<n;j++){
                
                if(c == s.charAt(j)){
                    freqCount++;
                }
            }
            if(freqCount%2 == 0){
                min_even = Math.min(freqCount,min_even);
                
            }else{
                max_odd = Math.max(freqCount,max_odd);
            }
        }
        return max_odd - min_even;
    }
}