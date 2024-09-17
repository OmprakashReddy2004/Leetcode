class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
         HashMap<String,Integer> map = new HashMap<>();
         addwords(s1,map);
         addwords(s2,map);
        ArrayList<String> list = new ArrayList<>();
         
         for(Map.Entry<String,Integer> entry: map.entrySet()){
            if(entry.getValue()==1){
                list.add(entry.getKey());
            }
         }
         int index = 0;
         String [] res = new String[list.size()];
         for(int i=0;i<list.size();i++){
              res[index++] = list.get(i);
         }
         return res;
         

    }
    public static void addwords(String str,HashMap<String,Integer> map){
        int startIndex = 0;
        for(int i=0;i<=str.length();i++){
            if(i==str.length() || str.charAt(i)==' '){
                if(i>startIndex){
                    String word = str.substring(startIndex,i);
                    if(map.containsKey(word)){
                    map.put(word,map.get(word)+1);
                }else{
                    map.put(word,1);
                }
                }
                startIndex = i + 1;
            }

        }

    }
}