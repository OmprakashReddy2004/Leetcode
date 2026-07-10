class Solution {
     int count = 0;
    public int numTilePossibilities(String tiles) {

       
        char[] arr = tiles.toCharArray();
        Arrays.sort(arr);
        tiles = new String(arr);
        boolean visited [] = new boolean[tiles.length()];
        dfs(tiles,visited);

        return count;
    }
    public void dfs(String tiles,boolean [] visited){
            

          char prev = '#';
            for(int i=0;i<tiles.length();i++){
                 if(visited[i])
                    continue;
                 if(prev == tiles.charAt(i))
                    continue;
                
                prev = tiles.charAt(i); 
                visited[i] = true;
                count++;
                dfs(tiles,visited);
                visited[i] = false;
            }

    }
}