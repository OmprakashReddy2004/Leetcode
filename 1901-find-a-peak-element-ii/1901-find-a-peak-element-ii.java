class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

         int lo = 0;
         int hi = m - 1;

         while(lo <= hi){
            int mid = lo + (hi - lo)/2;
            int row = maxElement(mat,mid);

            int left = mid - 1 >= 0 ? mat[row][mid - 1] : Integer.MIN_VALUE;
            int right = mid + 1 < m ? mat[row][mid + 1] : Integer.MIN_VALUE;


            if(mat[row][mid] > left && mat[row][mid] > right){
                return new int[]{row,mid};
            }else if(left > mat[row][mid]){
                hi = mid-1;
            }else{
                lo = mid + 1;
            }
         }
         return new int[]{-1,-1};
    }
    public static int maxElement(int [][] arr,int col){
        int index = -1;
        int max = Integer.MIN_VALUE;

        for(int row=0;row<arr.length;row++){
            if(arr[row][col] > max){
               max = arr[row][col];
               index = row;
            }
        }
        return index;
    }

}