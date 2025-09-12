// User function Template for Java
class Solution {
    public int getMinDiff(int[] arr, int k) {
        // code here
        int n = arr.length;
        Arrays.sort(arr);

        int res = arr[n - 1] - arr[0];

        for(int i=0; i<n-1; i++){
            int min = Math.min(arr[0] + k, arr[i + 1] - k);
            int max = Math.max(arr[i] + k, arr[n - 1] - k);
            res = Math.min(res, max - min);
        }
        return res;
        
    }
}