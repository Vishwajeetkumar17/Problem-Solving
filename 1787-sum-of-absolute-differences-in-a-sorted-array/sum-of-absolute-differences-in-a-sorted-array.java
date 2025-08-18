class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n = nums.length;
        int[] prefixSum = new int[n];
        int sum = 0;
        for(int i=0;i<n;i++){
            sum += nums[i];
            prefixSum[i] += sum;
        }
        int[] res = new int[n];
        for(int i=0;i<n;i++){
            int lSum = (i+1)*nums[i] - prefixSum[i];
            int rSum = (prefixSum[n-1] - prefixSum[i]) - (n-i-1)*nums[i];
            res[i] = lSum + rSum;
        }
        return res;
    }
}