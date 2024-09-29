class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> list = new ArrayList<>();
        
        for(int i=0;i<=rowIndex;i++){
            List<Integer> row = new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    row.add(1);
                }else{
                    List<Integer> prevRow = list.get(i-1);
                    row.add(prevRow.get(j-1)+prevRow.get(j));
                }
            }
            list.add(row);
        }
         return list.get(rowIndex);
    }
}