class Solution {
    public int hIndex(int[] citations) {
        // code here
        Arrays.sort(citations);
        int n = citations.length, ans = 0, left = 1,right = Arrays.stream(citations).max().getAsInt();
        while(left <= right){
            int mid = (left+right)/2;
            int flag = 0;
            for(int i=0;i<n;i++){
                if(mid <= citations[i] && mid <= n-i){
                    ans = mid;
                    left = mid+1;
                    flag = 1;
                    break;
                }
            }
            if(flag == 0)
                right = mid-1;
        }
        return ans;
    }
}