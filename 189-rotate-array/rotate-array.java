class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        rotate1(nums, 0, n-1);
        rotate1(nums, 0, k-1);
        rotate1(nums, k, n-1);
    }
    public void rotate1(int[] nums, int s, int e){
        while(s<e){
            swap(nums, s, e);
            s++; e--;
        }
    }
    public void swap(int[] nums, int s, int e){
        int temp = nums[s];
        nums[s] = nums[e];
        nums[e] = temp;
    }
}