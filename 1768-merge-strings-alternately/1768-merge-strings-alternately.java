class Solution {
    public String mergeAlternately(String word1, String word2) {
        
        StringBuilder sb = new StringBuilder();

        int pointerOne = 0;
        int pointerTwo = 0;

        while (pointerOne < word1.length() && pointerTwo < word2.length()){
            sb.append(word1.charAt(pointerOne));
            sb.append(word2.charAt(pointerTwo));

            pointerOne++;
            pointerTwo++;
        }

        if(pointerOne < word1.length()){
            String s = word1.substring(pointerOne,word1.length());
            sb.append(new StringBuilder(s));
        }

        if(pointerTwo < word2.length()){
            String s = word2.substring(pointerTwo,word2.length());
            sb.append(new StringBuilder(s));
        }

        return sb.toString();

    }
}