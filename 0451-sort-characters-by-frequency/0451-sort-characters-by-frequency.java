class Solution {
    public String frequencySort(String s) {
        // store it in char array.
        // now for frequency you can use hashmap :)
        // we need to sort the hashmap and exhaust the list in descending order. you can use stream filters though.
         char[] chars = s.toCharArray();
          HashMap<Character,Integer> map = new HashMap<>();
          for(char x : chars){
            map.put(x,map.getOrDefault(x,0)+1);
          }
          List<Map.Entry<Character,Integer>> list = new ArrayList<>(map.entrySet());
           list.sort((entry1,entry2)-> entry2.getValue().compareTo(entry1.getValue()));

         StringBuilder st = new StringBuilder();
         int index =0;
         while(index < list.size()){
             Map.Entry<Character, Integer> entry = list.get(index);
             int freq= entry.getValue();
              while (freq >0) {
                 st.append(entry.getKey());
                 freq--;
            }
            index++;
         }
      return st.toString();
          
    }
}