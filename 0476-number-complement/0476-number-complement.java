class Solution {
    public int findComplement(int num) {
       StringBuilder str = new StringBuilder();
        while(num > 0){
             str.append(num%2);
            num = num/2;
        }
         str.reverse();
         for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='0'){
                str.setCharAt(i,'1');
            }else if(str.charAt(i)=='1'){
                str.setCharAt(i,'0');
            }
         }
          int res =0;
         for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='1'){
                res+=Math.pow(2,str.length()-1-i);
            }
         }
         return res;
    }
}