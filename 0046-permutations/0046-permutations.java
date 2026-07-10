class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        boolean [] visited = new boolean[nums.length];
        dfs(0,nums,visited,res,new ArrayList<>());
        return res;
    }
    public static void dfs(int idx, int [] arr,boolean [] visited,List<List<Integer>> res, List<Integer> ds){

        if(ds.size()== arr.length){
            res.add(new ArrayList<>(ds));
            return;
        }

        for(int i=0;i<arr.length;i++){
            if(visited[i]) 
                continue;
            
            ds.add(arr[i]);
            visited[i] = true;
            dfs(i+1,arr,visited,res,ds);
            ds.remove(ds.size() - 1);
            visited[i] = false;
         }
        

    }
}