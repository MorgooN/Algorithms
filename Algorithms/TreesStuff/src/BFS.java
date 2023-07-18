// O(N) complexity


public class BFS {
    public int numIslands(char[][] grid) {
        int count = 0;

        for (int i = 0; i < grid.length; ++i) {           // processing rows of 2d-array
            for (int j = 0; j < grid[i].length; ++j) {    // processing columns
                if (grid[i][j] == '1') {
                    count += 1;
                    callBFS(grid, i, j);
                }
            }
        }
        return count;
    }


    private void callBFS(char[][] grid, int i, int j) {
        if(i < 0 || i >= grid.length || j < 0 || j >= grid.length || grid[i][j] == 0){
            return;
        }
        callBFS(grid, i+1, j);  // checking rows (upper)
        callBFS(grid, i-1, j);  // lower
        callBFS(grid, i, j+1);  // checking columns (left)
        callBFS(grid, i, j-1);  // right

    }

}


