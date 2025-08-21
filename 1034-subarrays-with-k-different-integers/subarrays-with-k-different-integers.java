class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atMost(nums, k) - atMost(nums, k-1);
    }
    public int atMost(int[] nums, int k)
    {
        Map<Integer,Integer> map = new HashMap<>();
        int i = 0, j = 0, cnt = 0;
        while(j < nums.length){
            map.put(nums[j], map.getOrDefault(nums[j],0)+1);
            while(map.size()>k){
                map.put(nums[i], map.get(nums[i])-1);
                if(map.get(nums[i])==0)
                {
                    map.remove(nums[i]);
                }
                i++;
            }
            cnt += j - i+1;
            j++;
        }
        return cnt;
    }
}
