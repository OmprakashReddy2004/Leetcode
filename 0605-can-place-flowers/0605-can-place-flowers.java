class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
         List<Integer> list = new ArrayList<>();
         for(int x : flowerbed){
            list.add(x);
         }
            int size = list.size();
            int count = 0;
         for(int i=0;i<size;i++){
            int left = (i==0) ? 0 : list.get(i-1);
            int right = (i==size-1) ? 0 : list.get(i+1);
            int curr = list.get(i);

            if(left == 0 && curr == 0 && right==0){
                list.set(i,1);
                count++;
                i++;
            }
         }

         return count >=n;
    }
}