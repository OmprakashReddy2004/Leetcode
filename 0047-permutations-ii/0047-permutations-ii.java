class Solution {
   public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
         boolean [] visited = new boolean [nums.length];
         
         dfs(nums,visited,res,new ArrayList<>());
         return res;
    }
    public static void dfs(int []arr,boolean [] visited,List<List<Integer>> res, List<Integer> ds){

        if(ds.size() == arr.length){
            res.add(new ArrayList<>(ds));
            return;
        }
        int prev = -11;
        for(int i=0;i<arr.length;i++){
            if(visited[i] || prev==arr[i]){
                continue;
            }

            visited[i] = true;
            ds.add(arr[i]);
            dfs(arr,visited,res,ds);
            visited[i] = false;
            ds.remove(ds.size() - 1);
            prev = arr[i];
        }
    }
}