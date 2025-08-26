class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int max = 0;
        double maxDiag = 0;
        double diag = 0;
        for(int[] arr : dimensions){
            int len = arr[0] * arr[0];
            int wid = arr[1] * arr[1];
            diag = Math.sqrt(len + wid);
            if(diag > maxDiag){
                maxDiag = diag;
                max = arr[0] * arr[1];
            }
            else if(diag == maxDiag){
                max = Math.max(max, arr[0] * arr[1]);
            }             
        }
        return max;
    }
}