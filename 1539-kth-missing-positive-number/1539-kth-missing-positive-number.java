class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n = arr.length;
        int nums [] = new int[1000];
        Set<Integer> set = new HashSet<>();

        for(int x : arr){
            set.add(x);
        }
        int count = 0;
       

        for(int i=1;i<=2001;i++){

            if(!set.contains(i)){
                count++;
            }

            if(count == k){
                return i;
            }
        }

        return -1;



        
    }
}