class Solution {
    public void setZeroes(int[][] matrix) {
         int rowLength = matrix.length;
         int columnLength = matrix[0].length;
         HashSet<Integer> set1 = new HashSet<>();
         HashSet<Integer> set2 = new HashSet<>();

         for(int row=0;row<rowLength;row++){
            for(int column =0;column<columnLength;column++){
                if(matrix[row][column]==0){
                    set1.add(row);
                    set2.add(column);
                }
            }
         }
         for(int row =0;row<rowLength;row++){
            for(int column =0;column<columnLength;column++){
                if(set1.contains(row)|| set2.contains(column)){
                     matrix[row][column]=0;
                }
            }
         }


  }
         }
         
    
