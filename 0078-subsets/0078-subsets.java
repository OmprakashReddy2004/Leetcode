class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        dfs(0,nums,result,new ArrayList<>());
        return result;
    }
    public static void dfs(int idx, int [] arr, List<List<Integer>> result, List<Integer> subset){

        if(idx >= arr.length){
            result.add(new ArrayList<>(subset));
            return;
        }
        //include
        subset.add(arr[idx]);
        dfs(idx+1,arr,result,subset);
        // not include
        subset.remove(subset.size() -1);
        dfs(idx+1,arr,result,subset);
    }
}