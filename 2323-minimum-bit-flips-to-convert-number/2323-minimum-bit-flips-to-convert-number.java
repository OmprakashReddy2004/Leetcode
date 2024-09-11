class Solution {
    public int minBitFlips(int start, int goal) {
        
        String s = "";
        String g ="";
        while(goal > 0){
            int rem = goal % 2;
            g = rem + g;
            goal/=2;
        }
        while(start>0){
            int rem = start % 2;
            s = rem + s;
            start/=2;
        }
        int diff = Math.min(s.length(),g.length());
        int sub = Math.abs(s.length()-g.length());
        if(s.length()==diff){
            for(int i=0;i<sub;i++){
                s = 0 + s;
            }
        }else{
            for(int i=0;i<sub;i++){
                g = 0 + g;
            }
        }
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != g.charAt(i)) {
                count++;
            }
        }
        return count;

    }
}