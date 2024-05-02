import java.util.Arrays;

class Solution {
    public String reversePrefix(String word, char ch) {
        char[] chars = word.toCharArray();
        int index = -1;
        
        // Find the index of the character 'ch' in the word
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ch) {
                index = i;
                break;
            }
        }
        
        // If the character 'ch' is not found, return the original word
        if (index == -1) {
            return word;
        }

        // Reverse the prefix of the word up to the character 'ch'
        int left = 0;
        int right = index;
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }

        // Convert the char array back to a string and return it
        return String.valueOf(chars);
    }
}
