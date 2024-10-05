class Solution {
    public int[] countBits(int n) {
        int [] arr = new int[n+1];
        return helper(n,arr,n);
    }
    public static int[] helper(int n,int [] arr,int index){
        if(n==0){
            return arr;
        }
        String binary = Integer.toBinaryString(n);
        int count = 0;
        for(int i=0;i<binary.length();i++){
            if(binary.charAt(i)=='1'){
                count++;
            }
        }
        arr[index] = count;
      return  helper(n-1,arr,index-1);
    }
}