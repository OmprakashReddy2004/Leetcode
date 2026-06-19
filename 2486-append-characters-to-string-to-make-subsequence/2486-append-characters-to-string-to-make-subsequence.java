class Solution {
    public int appendCharacters(String s, String t) {
        int n = s.length();
        int m = t.length();

        int one = 0;
        int two = 0;

        int count = 0;

        while(one < s.length() && two<t.length()){
            if(s.charAt(one)==t.charAt(two)){
                two++;
            }
            one++;
        }

        return m - two;
    }
}