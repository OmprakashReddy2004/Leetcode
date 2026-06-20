class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String , List<String>> map = new HashMap<>();


        for(String s : strs){

            char [] sorted = s.toCharArray();

            Arrays.sort(sorted);
            String key = new String(sorted);

            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            } 
                map.get(key).add(s);

        }

       return new ArrayList<>(map.values());
    }
}