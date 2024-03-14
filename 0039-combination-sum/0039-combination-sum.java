class Solution {
    private void findCombinations(int i,int []arr,int target, List<List<Integer>> ans, List<Integer> list){
        if(i==arr.length){
            if(target==0){
                ans.add(new ArrayList<>(list));
            }
            return;
        }
        if(arr[i]<=target){
            list.add(arr[i]);
            findCombinations(i,arr,target-arr[i],ans,list);
            list.remove(list.size()-1);
        }
          findCombinations(i+1,arr,target,ans,list);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        findCombinations(0,candidates,target,ans,new ArrayList<>());
        return ans;
    }
}