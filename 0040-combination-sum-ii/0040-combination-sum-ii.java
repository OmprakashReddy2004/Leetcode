class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
       List<List<Integer>> list = new ArrayList<>();
       findCombinations(0,target,candidates,list,new ArrayList<>());
       return list;
    }

    public static void findCombinations(int idx, int target, int [] arr, List<List<Integer>> list, List<Integer> ds){

        
            if(target == 0){
                list.add(new ArrayList<>(ds));
                return;
            }
            for(int i = idx;i<arr.length;i++){
                
                if(i > idx && arr[i]==arr[i-1]){
                    continue;
                }

                if(arr[i] > target){
                    break;
                }
                ds.add(arr[i]);
                findCombinations(i+1, target - arr[i], arr,list, ds);
                ds.remove(ds.size()-1);
            }
        
             
             

         
    }
}