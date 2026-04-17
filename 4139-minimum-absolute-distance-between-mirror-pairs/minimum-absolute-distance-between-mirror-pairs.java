import java.util.*;

class Solution {
    public int minMirrorPairDistance(int[] nums) {
        Map<Integer, Integer> mpp = new HashMap<>();
        int minDis = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if(mpp.containsKey(nums[i])){
                minDis = Math.min(minDis, i - mpp.get(nums[i]));
            }
            int rev = revNum(nums[i]);
            mpp.put(rev, i);
        }
        return minDis == Integer.MAX_VALUE ? -1 : minDis;
    }
    public int revNum(int num){
        int rev = 0;
        while(num > 0){
            rev = rev * 10 + (num % 10);
            num /= 10;
        }
        return rev;
    }
}