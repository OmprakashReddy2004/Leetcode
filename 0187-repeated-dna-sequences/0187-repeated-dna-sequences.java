class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        
         HashMap<String,Integer> map = new HashMap<>();
          List<String> res = new ArrayList<>();
          if(s.length() < 10) return res;
         
        int left = 0;

        for(int right=0;right<s.length();right++){


                if(right - left + 1 == 10){
                String sub = s.substring(left,right+1);
                int freq = map.getOrDefault(sub,0);


                if(freq==1){
                    res.add(sub);
                }
                map.put(sub,freq+1);
                left++;
            }
        }
        return res;
    }
}