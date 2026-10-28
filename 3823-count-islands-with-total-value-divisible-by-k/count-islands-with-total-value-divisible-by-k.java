class Solution {
    int m;
    int n;

    int[][] directions = {
        {-1, 0},
        {1, 0},
        {0, -1},
        {0, 1}
    };

    long solve(int[][] grid, int i, int j) {
        if (i < 0 || i >= m || j < 0 || j >= n || grid[i][j] == 0) {
            return 0;
        }

        long sum = grid[i][j];
        grid[i][j] = 0; // Mark as visited

        for (int k = 0; k < 4; k++) {
            int nr = i + directions[k][0];
            int nc = j + directions[k][1];

            sum += solve(grid, nr, nc);
        }

        return sum;
    }

    public int countIslands(int[][] grid, int k) {
        m = grid.length;
        n = grid[0].length;

        int count = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] > 0) {
                    long sum = solve(grid, i, j);

                    if (sum % k == 0) {
                        count++;
                    }
                }
            }
        }

        return count;
    }
}