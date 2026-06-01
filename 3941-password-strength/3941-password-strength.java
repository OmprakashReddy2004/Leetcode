class Solution {
    public int passwordStrength(String password) {
        
        int ans = 0;
        Set<Character> set = new HashSet<>();

        for(char c : password.toCharArray()){
            int ascii = (int) c;

            if(ascii >= 97 && ascii<=122){
                if(set.contains(c)){
                    continue;
                 }else{
                    set.add(c);
                    ans+=1;
                 }
             }else if(ascii >=65 && ascii<= 90){
                if(set.contains(c)){
                    continue;
                 }else{
                     set.add(c);
                    ans+=2;
                 }
            }else if(ascii >=48 && ascii<= 57){
                if(set.contains(c)){
                    continue;
                 }else{
                     set.add(c);
                    ans+=3;
                 }
            }else{
                if(set.contains(c)){
                    continue;
                 }else{
                     set.add(c);
                    ans+=5;
                 }
            }
        }
        return ans;
    }
}