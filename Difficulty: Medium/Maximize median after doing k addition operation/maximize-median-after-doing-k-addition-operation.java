import java.util.*;

class Solution {
    
    private boolean possible(long mid, int[] arr, int k) {
        long val = 0;
        int n = arr.length;
        int half = n / 2;
        
        if(n % 2 == 0){
            val += Math.max(0L, 2 * mid - arr[half] - arr[half - 1]);
        }
        else{
            val += Math.max(0L, mid - arr[half]);
        }
        
        for(int i = half + 1; i < n; i++){
            val += Math.max(0L, mid - arr[i]);
        }
        
        return val <= k;
    }
    
    public int maximizeMedian(int[] arr, int k) {
        Arrays.sort(arr);
        long l = 0;
        long r = arr[arr.length - 1] + (long) k;
        long ans = 0;
        
        while(l <= r){
            long mid = l + (r - l) / 2;
            if(possible(mid, arr, k)){
                ans = mid;
                l = mid + 1;
            }
            else{
                r = mid - 1;
            }
        }
        
        return (int) ans;
    }
}
