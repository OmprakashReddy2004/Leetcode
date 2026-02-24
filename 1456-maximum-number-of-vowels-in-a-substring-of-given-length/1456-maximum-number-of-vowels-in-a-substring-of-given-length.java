class Solution {
    public int maxVowels(String s, int k) {
        int max = 0;

        int freq [] = new int[26];

        int left = 0;
        for(int right = 0;right<s.length();right++){

             freq[s.charAt(right) - 'a']++;

                if(right - left + 1 == k){
                    int count = 0;
                    for(int i=0;i<26;i++){
                        if(i==0 || i==4 || i==8 || i==14 || i==20){
                            count+=freq[i];
                        }
                    }
                    max = Math.max(max,count);
                    freq[s.charAt(left) - 'a']--;
                    left++;

                }
        }
        return max;
    }
}