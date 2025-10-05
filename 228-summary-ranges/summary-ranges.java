class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ls = new ArrayList<>();
        int i = 0;
        while(i < nums.length){
            int st = nums[i];
            while(i < nums.length - 1 && nums[i] + 1 == nums[i+1]){
                i++;
            }
            if(st != nums[i]){
                ls.add(Integer.toString(st) + "->" + Integer.toString(nums[i]));
            }
            else{
                ls.add(Integer.toString(nums[i]));
            }
            i++;
        }
        return ls;
    }
}