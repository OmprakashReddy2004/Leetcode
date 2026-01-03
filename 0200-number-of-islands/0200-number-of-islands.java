class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;
        boolean visited[][] = new boolean[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){

                if(grid[i][j]=='1' && !visited[i][j]){
                    count++;
                    dfs(grid,i,j,visited);
                }
            }
        }
        return count;
    }
    public static void dfs(char [][] grid,int row, int col,boolean [][]visited){

       if(row < 0 || col<0 || row>=grid.length || col>=grid[0].length){
        return;
       }

       if(grid[row][col] == '0' || visited[row][col]){
        return;
       }

       visited[row][col] = true;

       dfs(grid, row+1, col, visited);
       dfs(grid, row-1, col, visited);
       dfs(grid, row, col+1, visited);
       dfs(grid, row, col-1, visited);
    }
}