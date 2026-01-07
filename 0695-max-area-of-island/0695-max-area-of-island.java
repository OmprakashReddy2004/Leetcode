class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        boolean [][] visited = new boolean[m][n];
        int max = 0;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j] == 1 && !visited[i][j]){
                     
                    max = Math.max(max,dfs(grid,i,j,visited));
                }
            }
        }
        return max;
    }
    public static int dfs(int [][] grid,int row,int col,boolean [][] visited){

        if(row < 0 || col <0 || row>= grid.length || col>=grid[0].length){
            return 0;
        }

        if(grid[row][col] == 0 || visited[row][col]) return 0;
       
        visited[row][col] = true;


       return 1 +  dfs(grid,row+1,col,visited)
                +  dfs(grid,row-1,col,visited)
                +  dfs(grid,row,col+1,visited)
                +  dfs(grid,row,col-1,visited);
    }
}