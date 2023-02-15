class Solution {
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) return 0;
        int numberOfIslands = 0;

        for (int row = 0; row < grid.length; row++) {
            for (int column = 0; column < grid[0].length; column++) {
                if (grid[row][column] == '1') {
                    numberOfIslands++;
                    dfs(grid, row, column);
                }
            }
        }
        return numberOfIslands;
    }

    public void dfs(char[][] grid, int row, int column) {
        int r = grid.length;
        int c = grid[0].length;

        if (row < 0 || column < 0 || row >= r || column >= c || grid[row][column] == '0') return;

        grid[row][column] = '0';
        // search in 4 direction
        dfs(grid, row - 1, column);
        dfs(grid, row + 1, column);
        dfs(grid, row, column - 1);
        dfs(grid, row, column + 1);
    }
}