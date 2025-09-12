class Solution {
    public int getMinDiff(int[] arr, int k) {
        // code here
        int n = arr.length;
        if(n == 1) return 0;
        Arrays.sort(arr);

        int res = arr[n - 1] - arr[0];

        for(int i=0; i<n-1; i++){
            int min = Math.min(arr[0] + k, arr[i + 1] - k);
            int max = Math.max(arr[i] + k, arr[n - 1] - k);
            if(min < 0) continue;
            res = Math.min(res, max - min);
        }
        return res;
    }
}
