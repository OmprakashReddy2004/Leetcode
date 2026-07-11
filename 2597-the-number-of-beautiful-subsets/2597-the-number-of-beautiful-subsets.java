class Solution {

    int count = 0;

    public int beautifulSubsets(int[] nums, int k) {
        dfs(0, nums, k, new ArrayList<>());
        return count;
    }

    public void dfs(int idx, int[] nums, int k, List<Integer> ds) {

        if (idx == nums.length) {

            if (ds.isEmpty()) return;
            for (int i = 0; i < ds.size(); i++) {
                for (int j = i + 1; j < ds.size(); j++) {
                    if (Math.abs(ds.get(i) - ds.get(j)) == k) {
                        return;
                    }
                }
            }

            count++;
            return;
        }

         
        ds.add(nums[idx]);
        dfs(idx + 1, nums, k, ds);
        ds.remove(ds.size() - 1);
        dfs(idx + 1, nums, k, ds);
    }
}