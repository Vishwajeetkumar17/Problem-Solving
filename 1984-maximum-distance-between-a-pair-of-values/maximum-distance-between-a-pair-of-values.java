class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int dis = 0;
        int maxDis = 0;
        int n = nums1.length, m = nums2.length;
        int i = 0, j = 0;
        while(i < n && j < m){
            if(nums1[i] <= nums2[j]){
                dis = j - i;
                maxDis = Math.max(maxDis, dis);
                j++;
            }
            else{
                i++;
            }
            
        }
        return maxDis;
    }
}