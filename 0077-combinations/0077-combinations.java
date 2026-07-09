class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        int [] arr = new int [n+1];
        for(int i=1;i<=n;i++){
            arr[i] = i;
        }
        dfs(1,k,arr,res,new ArrayList<>());
        return res;
    }
    public static void dfs(int idx,int k,int [] arr,List<List<Integer>> res, List<Integer> ds){

        if(ds.size()==k){
            res.add(new ArrayList<>(ds));
            return;
        }

        if(idx >= arr.length){
            return;
        }

        ds.add(arr[idx]);
        dfs(idx+1,k,arr,res,ds);
        ds.remove(ds.size() -1);
        dfs(idx+1,k,arr,res,ds);

    }
}