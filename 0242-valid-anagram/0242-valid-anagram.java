class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length();
        int m = t.length();

        if(n!=m) return false;

         HashMap<Character,Integer> map = new HashMap<>();

         for(int i=0;i<n;i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                map.put(c,map.get(s.charAt(i))+1);
            }else{
                map.put(c,1);
            }
         }

         for(int i=0;i<m;i++){
            char c = t.charAt(i);
            if(!map.containsKey(c) || map.get(c)==0 ){
                 return false;
            }else{
                map.put(c,map.get(c)-1);
            }
         }
         return true;
    }
}