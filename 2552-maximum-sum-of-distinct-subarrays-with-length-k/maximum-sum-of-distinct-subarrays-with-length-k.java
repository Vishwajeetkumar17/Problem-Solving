class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long sum = 0;
        long max = 0;
        Map<Integer, Integer> mpp = new HashMap<>();
        int i = 0;
        for(int j=0; j<nums.length; j++){
            sum += nums[j];
            mpp.put(nums[j], mpp.getOrDefault(nums[j], 0)+1);
            if(j - i + 1 > k){
                sum -= nums[i];
                mpp.put(nums[i], mpp.get(nums[i]) - 1);
                if(mpp.get(nums[i]) == 0){
                    mpp.remove(nums[i]);
                }
                i++;
            }
            if(j - i + 1 == k && mpp.size() == k){
                max = Math.max(max, sum);
            }
        }
        return max;
    }
}