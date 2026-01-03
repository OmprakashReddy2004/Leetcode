class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int m = image.length;
        int n = image[0].length;  
        boolean visited[][] = new boolean[m][n];
        int trace = image[sr][sc];
        dfs(image,sr,sc,color,trace,visited);
        return image;
       
    }
    public static void dfs(int [][]image,int row,int col,int color,int trace, boolean[][]visited){
        if(row < 0 || col < 0 || row >= image.length || col >= image[0].length){
            return;
        }
        if(image[row][col]!=trace || visited[row][col]){
            return;
        }
        image[row][col] = color;
        visited[row][col] = true;

        dfs(image,row+1,col,color,trace,visited);
        dfs(image,row-1,col,color,trace,visited);
        dfs(image,row,col+1,color,trace,visited);
        dfs(image,row,col-1,color,trace,visited);
    }
}