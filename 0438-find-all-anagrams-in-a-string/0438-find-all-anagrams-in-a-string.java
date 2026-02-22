class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();

        int pfreq[] = new int[26];
        int sfreq[] = new int[26];

        for(int i=0;i<p.length();i++){
            pfreq[p.charAt(i) - 'a']++;

        }

        int left = 0;

        for(int right=0;right<s.length();right++){
            sfreq[s.charAt(right) - 'a']++;

            if(right - left + 1 > p.length()){
                sfreq[s.charAt(left) - 'a']--;
                left++;
            }

            if(right - left + 1 == p.length()){
                if(validate(sfreq,pfreq)){
                    res.add(left);
                }
            }
        }
        return res;
    }
    public static boolean validate(int []s, int []p){
        for(int i=0;i<26;i++){
            if(s[i]!=p[i]) return false;
        }
        return true;
    }
}