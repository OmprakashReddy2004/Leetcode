class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        solve(0,nums,subset,ans);
        return ans;
    }
    public static void solve(int idx,int [] nums,List<Integer> subset, List<List<Integer>> ans){
        ans.add(new ArrayList<>(subset));

        for(int i=idx;i<nums.length;i++){
            subset.add(nums[i]);
            solve(i+1,nums,subset,ans);
            subset.remove(subset.size() - 1);
        }
    }
}