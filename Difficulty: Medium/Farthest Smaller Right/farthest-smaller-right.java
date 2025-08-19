class Solution {
    public ArrayList<Integer> farMin(int[] arr) {
        // Code Here
        int n = arr.length;
        ArrayList<Integer> result = new ArrayList<>(n);

        int[] suffixMin = new int[n];
        suffixMin[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suffixMin[i] = Math.min(arr[i], suffixMin[i + 1]);
        }
        for (int i = 0; i < n; i++) {
            int low = i + 1, high = n - 1, ans = -1;
            while (low <= high) {
                int mid = (low + high) / 2;
                if (suffixMin[mid] < arr[i]) {
                    ans = mid;
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
            result.add(ans);
        }
        return result;
    }
}