class Solution {
    public int totalFruit(int[] fruits) {
        // longest subarray length but at most 2 elements

        int n = fruits.length;
        int max = 0;
        int left = 0;
        int count = 0;

        Map<Integer,Integer> map = new HashMap<>();

        for(int right =0; right < n; right++){

            if(map.containsKey(fruits[right])){
                map.put(fruits[right],map.get(fruits[right])+1);
                count++;
            }else{
                map.put(fruits[right],1);
                count++;
            }

            if(map.size() <= 2){
                max = Math.max(max,count);

            }else{
                while(map.size()>2){
                map.put(fruits[left], map.get(fruits[left]) - 1);
                
                if (map.get(fruits[left]) == 0) {
                    map.remove(fruits[left]);
                }
                left++;
                count--;
                max = Math.max(max,count);
                }
                
            }
        }
        
        return max;
    }
}