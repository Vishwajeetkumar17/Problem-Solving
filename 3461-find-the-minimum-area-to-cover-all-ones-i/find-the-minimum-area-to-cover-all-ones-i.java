class Solution {
    public int minimumArea(int[][] grid) {
        if (grid.length == 0) return 0;
        int n = grid.length;
        int m = grid[0].length;
        int l = Integer.MAX_VALUE, r = 0, hi = 0, lo = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(grid[i][j] == 1){
                    l = Math.min(l,j);
                    r = Math.max(r,j);
                    hi = Math.max(hi, i);
                    lo = Math.min(lo ,i);
                }
            }
        }
        return (r - l + 1) * (hi - lo + 1);
    }
}