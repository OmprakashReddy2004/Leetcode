class Solution {

    HashMap<Character, String> map = new HashMap<>();
    List<String> ans = new ArrayList<>();

    public List<String> letterCombinations(String digits) {

        if (digits.length() == 0) return ans;

        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        backtrack(0, digits, new StringBuilder());

        return ans;
    }

    private void backtrack(int index, String digits, StringBuilder current) {

         
        if (index == digits.length()) {
            ans.add(current.toString());
            return;
        }

         
        String letters = map.get(digits.charAt(index));

         
        for (int i = 0; i < letters.length(); i++) {

            current.append(letters.charAt(i));   

            backtrack(index + 1, digits, current);  

            current.deleteCharAt(current.length() - 1);  
        }
    }
}