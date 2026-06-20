class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();

        for(int x : nums){
            map.put(x,map.getOrDefault(x,0) + 1);
        }

        List<Integer> [] buckets = new List[nums.length + 1];
        for(int i =0;i<buckets.length;i++){
            buckets[i] = new ArrayList<>();
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            int num = entry.getKey();
            int count = entry.getValue();
            buckets[count].add(num);
        }

        int [] res = new int[k];
        int idx = 0;

        for(int i=buckets.length - 1 ; i >=1 && idx< k ; i--){
            for(int num : buckets[i]){
                res[idx++] = num;
                if(idx>=k) break; 
            }

        }

        return res;

    }
}