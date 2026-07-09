class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        dfs(0,target,candidates,result,new ArrayList<>());
        return result;
    }
    public static void dfs(int idx,int target, int []arr, List<List<Integer>> result,List<Integer> ds){

        if(target==0){
            result.add(new ArrayList<>(ds));
            return;
        }

        if(target < 0){
            return;
        }
        int prev = -1;
        for(int i=idx;i<arr.length;i++){

            if(arr[i] == prev){
                continue;
            }
            //include 
            ds.add(arr[i]);
            dfs(i+1,target-arr[i],arr,result,ds);

            //not include
            ds.remove(ds.size() - 1);
            prev = arr[i];
           
        }
          
        
    }
}