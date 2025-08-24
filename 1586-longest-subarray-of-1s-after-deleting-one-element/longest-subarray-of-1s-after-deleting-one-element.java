class Solution {
    public int longestSubarray(int[] nums) {
        int n = nums.length;
        int cnt = 0;
        int max = 0;
        int j = 0;
        for(int i=0;i<n;i++){
            if(nums[i] == 0){
                cnt++;
            }
            while(cnt > 1){
                if(nums[j] == 0) cnt--;
                j++;
            }
            max = Math.max(max, i-j);
        }
        return max;
    }
}