class Solution {
    public String minWindow(String s, String t) {
        int [] sfreq = new int[128];
        int [] tfreq = new int[128];

        for(int i=0;i<t.length();i++){
            tfreq[t.charAt(i)]++;
        }
        int left = 0;
        int minLen = Integer.MAX_VALUE;
        int start = 0;

        for(int right=0;right<s.length();right++){
            sfreq[s.charAt(right)]++;

            while(validate(sfreq,tfreq)){
                 if(right - left + 1 < minLen){
                    minLen = right - left + 1;
                    start = left;
                 }

                 sfreq[s.charAt(left)]--;
                 left++;
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(start,start + minLen);
    }
    public static boolean validate (int [] sfreq,int [] tfreq){
        for(int i=0;i<128;i++){
            if(sfreq[i]<tfreq[i]){
                return false;
            }
        }

        return true;
    }
}