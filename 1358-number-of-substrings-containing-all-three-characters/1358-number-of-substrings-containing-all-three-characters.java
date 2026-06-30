class Solution {
    public int numberOfSubstrings(String s) {
        int count = 0;
        int n = s.length();
        int lo = 0;
        int hi = 0;

        int [] freq = new int[3];

        while(hi < n){

            freq[s.charAt(hi)-'a']++;

            while(freq[0]>0 && freq[1]>0 && freq[2]>0){
                count+= n - hi;
                freq[s.charAt(lo) - 'a']--;
                lo++;
            }

            hi++;
        }

        return count;
    }
}