class Solution {
    public ArrayList<Integer> minMaxCandy(int[] prices, int k) {
        // code here
        int n = prices.length;
        Arrays.sort(prices);
        ArrayList<Integer> ans = new ArrayList<>();
        int min = 0, max = 0;
        int cnt = 0;
        for(int i=0;i<n-cnt;i++){
            min += prices[i];
            max += prices[n-i-1];
            cnt += k;
        }
        ans.add(min);
        ans.add(max);
        return ans;
    }
}
