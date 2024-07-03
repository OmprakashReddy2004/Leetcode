class Solution {
    public int findContentChildren(int[] g, int[] s) {
         Arrays.sort(s);
         Arrays.sort(g);
         int gn = g.length;
         int sn = s.length;
         int count =0;
         int cookieIndex =0;
         for(int i=0;i<gn && cookieIndex<sn;i++){
            if(g[i]<=s[cookieIndex]){
                count++;
                cookieIndex++;
            }else{
                cookieIndex++;
                i--;
            }
         }
         return count;
    }
}
