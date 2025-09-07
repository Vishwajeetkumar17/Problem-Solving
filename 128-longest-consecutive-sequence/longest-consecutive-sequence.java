class Solution {
    public int longestConsecutive(int[] nums) {
        int max = 0;
        HashSet<Integer> set = new HashSet<>();

        for(int num : nums){
            set.add(num);
        }

        for(int num : nums){
            int len = 1;
            int left = num;
            while(set.contains(--left)){
                len++;
                set.remove(left);
            }
            int right = num;
            while(set.contains(++right)){
                len++;
                set.remove(right);
            }
            max = Math.max(max, len);
        }
        
        return max;
    }
}