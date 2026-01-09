class Solution {
    public void solve(char[][] board) {
        int m = board.length;
        int n = board[0].length;

        boolean [][] visited = new boolean[m][n];

        for(int i=0;i<m;i++){
            if(board[i][0] == 'O' && visited[i][0] == false){
                dfs(i,0,board,visited);
            }
            if(board[i][n-1] == 'O' && visited[i][n-1]==false){
                dfs(i,n-1,board,visited);
            }
        }

        for(int j=0;j<n;j++){
            if(board[0][j] == 'O' && visited[0][j] == false){
                dfs(0,j,board,visited);
            }
            if(board[m-1][j] == 'O' && visited[m-1][j]==false){
                dfs(m-1,j,board,visited);
            }
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]== 'O' && visited[i][j]==false){
                    board[i][j] = 'X';
                }
            }
        }

    }

    public static void dfs(int row, int col,char [][]board,boolean [][]visited){

        if(row<0 || col<0 || row>=board.length || col>=board[0].length){
            return;
        }
        if(board[row][col] == 'X' || visited[row][col]==true){
            return;
        }
        visited[row][col] = true;
        dfs(row+1,col,board,visited);
        dfs(row-1,col,board,visited);
        dfs(row,col+1,board,visited);
        dfs(row,col-1,board,visited);

    }
}