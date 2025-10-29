class Solution {
    public int smallestNumber(int n) {
        int cnt = 1;
        while(n > 1){
            n /= 2;
            cnt++;
        }
        int ans = (int)Math.pow(2,cnt);
        return ans-1;
    }
}