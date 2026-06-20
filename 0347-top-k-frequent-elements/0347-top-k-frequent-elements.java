class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer,Integer> map = new HashMap<>();

         for(int x : nums){
            map.putIfAbsent(x,0);
            map.put(x,map.get(x) + 1);
         }

         List<Integer> list = new ArrayList<>(map.keySet());
         list.sort((a,b) -> map.get(b) - map.get(a));

         int [] ans = new int[k];

         for(int i=0;i<k;i++){
            ans[i] = list.get(i);
         }


        return ans;


    }
}