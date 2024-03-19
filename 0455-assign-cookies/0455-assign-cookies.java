class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int c= 0;
        int gp = 0;
        int cp = 0;
        
        while (gp < g.length && cp < s.length) {
            if (s[cp] >= g[gp]) {
                c++;
                gp++;
                cp++;
            } else {
                // If the current cookie size is not sufficient for the current greed factor,
                // move to the next cookie size.
                cp++;
            }
        }
        return c;
    }
}
