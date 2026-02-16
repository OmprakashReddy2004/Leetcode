class Solution {
    public List<List<Integer>> generate(int numRows) {
        int [][] matrix = new int[numRows][numRows];
        int n = numRows;

        List<List<Integer>> res = new ArrayList<>();

         for(int i=0;i<n;i++){
            matrix[i][0] = 1;
         }

         for(int i=1;i<n;i++){
            for(int j=1;j<n;j++){
                matrix[i][j] = matrix[i-1][j] + matrix[i-1][j-1];
            }
         }

         for(int i=0;i<n;i++){
            List<Integer> temp = new ArrayList<>();
            for(int j=0;j<n;j++){
                if(matrix[i][j] !=0){
                    temp.add(matrix[i][j]);
                }
            }
            res.add(temp);
         }

         return res;
    }
}