class Solution {
    public int maxFrequencyElements(int[] nums) {
        int n = nums.length;
        int[] freq = new int[101];
        int max = 0;
        int cnt = 0;
        for(int i=0;i<n;i++){
            freq[nums[i]]++;
            max = Math.max(max, freq[nums[i]]);
        }
        for(int i=0;i<n;i++){
            if(freq[nums[i]] == max){
                cnt += max;
                freq[nums[i]]--;
            }
        }
        return cnt;
    }
}