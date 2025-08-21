class Solution {
    public int maxMinDiff(int[] arr, int k) {
        // code here
        Arrays.sort(arr);
        int n = arr.length;
        int s = 0, e = arr[n-1] - arr[0];
        int ans = 0;
        while(s<=e){
            int mid = s+ (e-s)/2;
            if(canFit(arr, k, mid)){
                ans = mid;
                s = mid + 1;
            }
            else{
                e = mid - 1;
            }
        }
        return ans;
    }
    
    public boolean canFit(int[] arr, int k, int mid){
        int cnt = 1;
        int last = arr[0];
        
        for(int i=1;i<arr.length;i++){
            if(arr[i] - last >= mid){
                cnt++;
                last = arr[i];
                if(cnt >= k) return true;
            }
        }
        return false;
    }
}
