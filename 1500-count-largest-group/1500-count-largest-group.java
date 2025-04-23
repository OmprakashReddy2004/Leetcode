class Solution {
    public int countLargestGroup(int n) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=1;i<=n;i++){
            String s = Integer.toString(i);
            int x = helper(s);
             map.put(x,map.getOrDefault(x,0)+1);
        }

        int max = Integer.MIN_VALUE;
        for(int x : map.values()){
            max = Math.max(max,x);
        }
        int count = 0;

        for(int x : map.values()){
            if(x==max) count++;
        }

        return count;

    }
    public static int helper(String s){
        int x =0;
        for(int i=0;i<s.length();i++){
            x+=s.charAt(i) - '0';
        }

        return x;
    }
}