class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];
        return Math.max(robb(nums, 0, n - 2), robb(nums, 1, n - 1));
    }
    private int robb(int[] nums, int low, int high) {
        int prev2 = 0, prev1 = 0; // prev2 = dp[i-2], prev1 = dp[i-1]
        for (int i = low; i <= high; i++) {
            int pick = prev2 + nums[i];
            int skip = prev1;
            int curr = Math.max(pick, skip);
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }
}