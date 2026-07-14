class Solution {
    int[] arr;
    Set<List<Integer>> set = new HashSet<>();

    public List<List<Integer>> findSubsequences(int[] nums) {
        arr = nums;
        dfs(0, new ArrayList<>());
        return new ArrayList<>(set);
    }

    public void dfs(int idx, List<Integer> ds) {

        if (ds.size() >= 2) {
            set.add(new ArrayList<>(ds));
        }

        for (int i = idx; i < arr.length; i++) {
            if (ds.isEmpty() || arr[i] >= ds.get(ds.size() - 1)) {
                ds.add(arr[i]);
                dfs(i + 1, ds);
                ds.remove(ds.size() - 1);
            }
        }
    }
}