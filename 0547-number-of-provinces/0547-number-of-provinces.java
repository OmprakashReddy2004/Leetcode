class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        int count = 0;

        boolean [] visited = new boolean[n];

        for(int i=0;i<n;i++){
            if(!visited[i]==true){
                count++;
                dfs(isConnected,i,visited);
            }
        }
        return count;

    }
    public static void dfs(int [][] graph, int i, boolean[] visited){
        for(int j=0;j<graph.length;j++){
            if(graph[i][j]!=0 && !visited[j]){
                visited[j] = true;
                dfs(graph,j,visited);
            }
        }
    }
}