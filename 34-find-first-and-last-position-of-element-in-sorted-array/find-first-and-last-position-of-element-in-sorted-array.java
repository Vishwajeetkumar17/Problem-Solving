class Solution {
    public int[] searchRange(int[] arr, int k) {
        int ans = arr.length;
        int s = 0, e = ans-1;
        while(s<=e){
            int mid = s + (e-s)/2;
            if(arr[mid]==k){
                ans = Math.min(mid, ans);
                e = mid-1;
            }
            else if(arr[mid]>k){
                e = mid-1;
            }
            else{
                s = mid+1;
            }
        }
        if(ans == arr.length) ans = -1;
        int ans1 = -1;
        s = 0; e = arr.length-1;
        while(s<=e){
            int mid = s + (e-s)/2;
            if(arr[mid]==k){
                ans1 = Math.max(mid, ans1);
                s = mid+1;
            }
            else if(arr[mid]>k){
                e = mid-1;
            }
            else{
                s = mid+1;
            }
        }
        if(ans1 == -1) ans1 = -1;
        return new int[]{ans, ans1};
    }
}