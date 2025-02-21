class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> Resultlist = new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            Resultlist.add(helper(i));
        }
        return Resultlist;
    }
    public List<Integer> helper(int row){
      int ans = 1;
       List<Integer> list = new ArrayList<>();
       list.add(ans);
       for(int col = 1;col<row;col++){
           ans = ans * (row-col);
           ans = ans/col;
           list.add(ans);
       }
       return list;
    } 
}