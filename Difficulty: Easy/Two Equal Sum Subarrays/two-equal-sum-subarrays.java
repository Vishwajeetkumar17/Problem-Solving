class Solution {
    public boolean canSplit(int arr[]) {
        // code here
        int total = 0;

        for (int num : arr) {
            total += num;
        }

        int leftSum = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            leftSum += arr[i];
            int rightSum = total - leftSum;

            if (leftSum == rightSum) {
                return true;
            }
        }

        return false;
    }
}