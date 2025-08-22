class Solution {
    public int median(int[][] mat) {
        // code here
        int n = mat.length, m = mat[0].length;
        int temp[] = new int[m*n];
        int a = 0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                temp[a++] = mat[i][j];
            }
        }
        Arrays.sort(temp);
        return temp[temp.length/2];
    }
}