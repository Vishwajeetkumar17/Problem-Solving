class Solution {
    public boolean searchMatrix(int[][] mat, int x) {
        // code here
        int n = mat.length;
        int m = mat[0].length;
        // int s = 0, e = n*m-1;
        // while(s<=e){
        //     int mid = s+(e-s)/2;
        //     int row = mid/m;
        //     int col = mid%m;
        //     if(mat[row][col] == x){
        //         return true;
        //     }
        //     else if(mat[row][col] < x){
        //         s = mid + 1;
        //     }
        //     else{
        //         e = mid - 1;
        //     }
        // }
        // return false;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j] == x) return true;
            }
        }
        return false;
    }
}