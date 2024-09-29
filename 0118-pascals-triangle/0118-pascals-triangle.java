class Solution {
    public List<List<Integer>> generate(int numRows) {
       
        int n = numRows;
        int [][] matrix = new int[n][n];
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(j==0){
                    matrix[i][j] = 1;
                }
            }
        }
        for(int i=1;i<matrix.length;i++){
            for(int j=1;j<matrix[0].length;j++){
                 matrix[i][j] = matrix[i-1][j] + matrix[i-1][j-1];
            }
        }
        for(int i=0;i<matrix.length;i++){
            List<Integer> row = new ArrayList<>();
            for(int j=0;j<matrix[0].length;j++){
                if( matrix[i][j] !=0){
                   row.add(matrix[i][j]);
                }
            }
            list.add(row);
        }
        return list;

    }
}