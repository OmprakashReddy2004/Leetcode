class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();
        int[] arr = {1,2,3,4,5,6,7,8,9};
        dfs(0,k,n,arr,res,new ArrayList<>());
        return res; 
    }
    public static void dfs(int idx,int k,int n,int [] arr,List<List<Integer>> res, List<Integer> ds){
        if(ds.size() == k){
            if(n==0){
                res.add(new ArrayList<>(ds));
            }
            return;
        }
         if(idx == arr.length){
            return;
         }

        for(int i=idx;i<arr.length;i++){
            ds.add(arr[i]);
            dfs(i+1,k,n-arr[i],arr,res,ds);
            ds.remove(ds.size() - 1);
        }
    }
}