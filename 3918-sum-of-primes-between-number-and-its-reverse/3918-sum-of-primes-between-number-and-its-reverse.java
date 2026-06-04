class Solution {
    public int sumOfPrimesInRange(int n) {
        int temp = n;
        String s = Integer.toString(temp);
        String reversed = new StringBuilder(s).reverse().toString();
        int r = Integer.parseInt(reversed);

        int min = Math.min(n,r);
        int max = Math.max(n,r);
        int res = 0;

        for(int i=min;i<=max;i++){
            if(isPrime(i)){
                res+=i;
            }
        }
        return res;

    }
    public static boolean isPrime(int n){
        if(n<2) return false;
        for(int i=2;i*i<=n;i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
}