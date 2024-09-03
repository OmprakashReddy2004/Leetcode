class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder st = new StringBuilder();
        int depth = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                if (depth > 0) {
                    st.append(c);
                }
                depth++;
            } else if (c == ')') {
                depth--;
                if (depth > 0) {
                    st.append(c);
                }
            }
        }

        return  st.toString();
    }
}
 