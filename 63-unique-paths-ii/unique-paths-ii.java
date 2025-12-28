class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        if(obstacleGrid[0][0] == 1) return 0;
        int[][] dp = new int[m][n];
        for(int[] row : dp){
            Arrays.fill(row, -1);
        }
        return uniquePaths(obstacleGrid, dp, m - 1, n - 1);
    }
    public int uniquePaths(int[][] obstacleGrid, int[][] dp, int i, int j){
        if(i < 0 || j < 0) return 0;
        if(obstacleGrid[i][j] == 1) return 0;
        if(i == 0 && j == 0) return 1;
        if(dp[i][j] != -1) return dp[i][j];

        return dp[i][j] = uniquePaths(obstacleGrid, dp, i - 1, j) + uniquePaths(obstacleGrid, dp, i, j - 1);
    }
}