class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();

        int n = numRows;
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        res.add(firstRow);

        for(int i=1;i<n;i++){
            List<Integer> prevRow = res.get(i-1);

            List<Integer> currRow = new ArrayList<>();
            currRow.add(1);
                for(int j=0;j<i-1;j++){
                    currRow.add(prevRow.get(j) + prevRow.get(j+1));
                }
                currRow.add(1);
                 res.add(currRow);
        }
       
        return res;
    }
    
}