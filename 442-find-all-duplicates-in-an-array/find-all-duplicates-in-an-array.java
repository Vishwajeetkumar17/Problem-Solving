class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        Map<Integer, Integer> mpp = new HashMap<>();
        for(int num : nums){
            mpp.put(num, mpp.getOrDefault(num, 0)+1);
        }
        for(Map.Entry<Integer, Integer> mp : mpp.entrySet()){
            if(mp.getValue() > 1){
                ans.add(mp.getKey());
            }
        }
        return ans;
    }
}