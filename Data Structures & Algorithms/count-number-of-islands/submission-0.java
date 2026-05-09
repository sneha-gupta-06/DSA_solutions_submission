class Solution {
    public int numIslands(char[][] grid) {

        int n = grid.length;
        int m = grid[0].length;

        boolean[][] visited = new boolean[n][m];

        int count = 0;

        for (int i =0; i<n; i++){
            for (int j =0; j<m; j++){
               if (!visited[i][j] && grid[i][j] == '1'){
                 dfs (grid, visited, i, j);
                 count ++;
               }
            }
        }

        return count;
        
    }

    public void dfs (char[][] grid, boolean[][] visited, int row, int col){

        visited[row][col] = true;

        int[] r = {0,-1,1,0};
        int[] c = {-1,0,0,1};

        for (int i = 0; i<4; i++){

            int nr = row + r[i];
            int nc = col + c[i];

            if (nr >= 0 && nr < grid.length && nc >= 0 && nc < grid[0].length && !visited[nr][nc] && grid[nr][nc] == '1'){
                dfs(grid, visited, nr, nc);
            }
        }
    }
}
