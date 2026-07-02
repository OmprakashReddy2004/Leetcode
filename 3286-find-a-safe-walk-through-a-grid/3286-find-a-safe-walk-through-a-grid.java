class Solution 
        {
            int [][] dir ={
            {1,0},
            {-1,0},
            {0,1},
            {0,-1}
         };
    public boolean findSafeWalk(List<List<Integer>> grid, int health) {
        int m = grid.size();
        int n = grid.get(0).size();

        int best [][] = new int[m][n];
        return dfs(0,0,health,grid,best);
    }
    public  boolean dfs(int row,int col,int health,List<List<Integer>> grid,int [][] best){
        int m = grid.size();
        int n = grid.get(0).size();

        if(row>=m || row < 0 || col>=n || col<0){
            return false;
        }
         
        
        if(grid.get(row).get(col) == 1){
            health--;
        }

        if(health<=0){
            return false;
        }

        if(health<= best[row][col]){
            return false;
        }
        best[row][col] = health;

        if(row == m-1 && col == n-1){
            return true;
        }
         

        for(int [] d : dir){
            int newRow = row + d[0];
            int newCol = col + d[1];

            if(dfs(newRow,newCol,health,grid,best)){
                return true;
            }
        }

        
        return false;
        

    }
}