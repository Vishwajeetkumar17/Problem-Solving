class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;
        int[] freq = new int[n+1];
        for(int i=0;i<n;i++){
            freq[nums[i]]++;
            if(freq[nums[i]] > 1){
                ans.add(nums[i]);
            }
        }
        return ans;
    }
}