class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        dfs(1,k,n,res,new ArrayList<>());
        return res;
    }
    public static void dfs(int idx,int k,int n,List<List<Integer>> res, List<Integer> ds){

        if(ds.size()==k){
            res.add(new ArrayList<>(ds));
            return;
        }

        for(int i=idx;i<=n;i++){
            ds.add(i);
            dfs(i+1,k,n,res,ds);
            ds.remove(ds.size() -1);
        }

        
        

    }
}