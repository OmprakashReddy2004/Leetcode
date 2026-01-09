class Solution {
    public int numEnclaves(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int cnt = 0;


        boolean [][] visited = new boolean[m][n];

        for(int i=0;i<m;i++){
            if(grid[i][0] == 1 && !visited[i][0]){
                dfs(i,0,grid,visited);
            }
            
            if(grid[i][n-1] == 1 && !visited[i][n-1]){
                dfs(i,n-1,grid,visited);
            }
        }
        for(int i=0;i<n;i++){
            if(grid[0][i] == 1 && !visited[0][i]){
                dfs(0,i,grid,visited);
            }
            
            if(grid[m-1][i] == 1 && !visited[m-1][i]){
                dfs(m-1,i,grid,visited);
            }
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j] == 1 && !visited[i][j]){
                    cnt++;
                }
            }
        }

    return cnt;

    }
    private static void dfs(int row,int col,int [][]grid,boolean[][]visited){
        if(row<0 || col<0 || row>=grid.length || col>=grid[0].length){
            return;
        }

        if(grid[row][col] == 0 || visited[row][col]){
            return;
        }

        visited[row][col] = true;

        
        dfs(row+1,col,grid,visited);
        dfs(row-1,col,grid,visited);
        dfs(row,col+1,grid,visited);
        dfs(row,col-1,grid,visited);
    }
}