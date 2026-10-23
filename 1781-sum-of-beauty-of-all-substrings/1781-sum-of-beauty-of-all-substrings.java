class Solution {
    public int beautySum(String s) {
        int res = 0;
        for(int i=0;i<s.length();i++){
            Map<Character,Integer> map = new HashMap<>();
            
            for(int j=i;j<s.length();j++){
                char c = s.charAt(j);
                if(map.containsKey(c)){
                    map.put(c,map.get(c)+1);
                }else{
                    map.put(c,1);
                }
             
             int max = 0;
             int min = Integer.MAX_VALUE;
             for(int val : map.values()){
                max = Math.max(max,val);
                min = Math.min(min,val);
                
             }
             res+= max - min;
           }

        }
        return res;

    }
}