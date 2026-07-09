class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        dfs(0, nums, res, new ArrayList<>());
        return res;
    }

    public static void dfs(int idx, int[] arr, List<List<Integer>> res, List<Integer> ds) {

        res.add(new ArrayList<>(ds));
        int prev = -11;

        for (int i = idx; i < arr.length; i++) {

            if (arr[i] == prev) {
                continue;
            }

            ds.add(arr[i]);
            dfs(i + 1, arr, res, ds);
            ds.remove(ds.size() - 1);
            prev = arr[i];
        }
    }
}