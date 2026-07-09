class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
       List<List<Integer>> list = new ArrayList<>();
       findCombinations(0,0,candidates,target,list,new ArrayList<>());
       return list;
    }
    public static void findCombinations(int idx,int total,int [] arr, int target,List<List<Integer>> list, List<Integer> ds){

        if(total == target){
            list.add(new ArrayList<>(ds));
            return;
        }

        if(idx >= arr.length || total > target){
            return;
        }

        ds.add(arr[idx]);
        findCombinations(idx,total+arr[idx],arr,target,list,ds);
        ds.remove(ds.size() - 1);
        findCombinations(idx+1,total,arr,target,list,ds);
    }
}