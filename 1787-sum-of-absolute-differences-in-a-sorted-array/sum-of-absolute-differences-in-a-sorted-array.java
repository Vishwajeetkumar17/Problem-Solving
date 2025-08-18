class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int tSum = Arrays.stream(nums).sum();
        int lSum = 0;
        for(int i=0;i<n;i++){
            int rSum = tSum - lSum - nums[i];
            int lDiff = nums[i]*i - lSum;
            int rDiff = rSum - nums[i]*(n-i-1);
            res[i] = lDiff + rDiff;
            lSum += nums[i];
        }
        return res;
    }
}