class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int [][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};

        Queue<int []> q = new LinkedList<>();
        int dist [][] = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j] == 0){
                    dist[i][j] = 0;
                    q.add(new int[]{i,j});
                }else{
                    dist[i][j] = Integer.MAX_VALUE;
                }
            }
        }

        while(!q.isEmpty()){
            int [] cell = q.poll();
            int row = cell[0];
            int col = cell[1];

            for(int [] dir : dirs){
                int newRow = row + dir[0];
                int newCol = col + dir[1];

                if(newRow>= 0 && newCol>=0 && newRow< m && newCol<n){
                    if(dist[newRow][newCol] > dist[row][col] + 1){
                        dist[newRow][newCol] = dist[row][col] +1;
                        q.add(new int[]{newRow,newCol});
                    }
                     
                }
            }
        }

        return dist;
            


    }
}