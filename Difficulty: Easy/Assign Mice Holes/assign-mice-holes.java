class Solution {
    public int assignHole(int[] mices, int[] holes) {
        // code here
         int n = mices.length;
         Arrays.sort(mices);
         Arrays.sort(holes);
         int res = Integer.MIN_VALUE;
         for(int i=0;i<n;i++){
             res = Math.max(res, Math.abs(mices[i]-holes[i]));
         }
         return res;
    }
};