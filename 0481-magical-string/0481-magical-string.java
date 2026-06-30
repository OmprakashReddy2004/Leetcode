class Solution {
    public int magicalString(int n) {
        if (n <= 0) return 0;
        if (n <= 3) return 1;

        StringBuilder sb = new StringBuilder("122");
        int i = 2;        
        char next = '1'; 

        while(sb.length() < n){
            int count = sb.charAt(i) - '0';

            while(count-- > 0){
                sb.append(next);
            }
            next = (next == '1') ? '2' : '1';
            i++;
        }

        int count = 0;
        for(int j=0;j<n;j++){
            if(sb.charAt(j) == '1') count++;
        }
        return count;
    }
}