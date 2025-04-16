class Solution {
    public boolean wordPattern(String pattern, String s) {
       HashMap<Character, String> map = new HashMap<>();
        HashSet<String> usedWords = new HashSet<>();

        String[] words = s.split(" ");

        if (words.length != pattern.length()) return false;

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = words[i];

            if (map.containsKey(c)) {
                if (!map.get(c).equals(word)) {
                    return false;
                }
            } else {
                if (usedWords.contains(word)) {
                    return false; // word already mapped to some other character
                }
                map.put(c, word);
                usedWords.add(word);
            }
        }
        return true;
    }
}