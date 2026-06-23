class Solution {
    public String frequencySort(String s) {
        int n = s.length();
        HashMap<Character,Integer> map = new HashMap<>();

        for(char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

         List<Character> [] buckets = new List[n+1];
         for(int i=0;i<=n;i++){
            buckets[i] = new ArrayList<>();
         }

         for(Map.Entry<Character,Integer> entry : map.entrySet()){
            char key = entry.getKey();
            int freq = entry.getValue();

            buckets[freq].add(key);
         }
            StringBuilder sb = new StringBuilder();
         for(int i=n;i>=1;i--){
            for(char c : buckets[i]){
                for(int j=0;j<i;j++){
                    sb.append(c);
                }
            }
         }

         return sb.toString();
    }
}