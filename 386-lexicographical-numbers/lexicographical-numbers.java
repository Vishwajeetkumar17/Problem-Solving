class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> ans = new ArrayList<>();
        for(int i=1;i<=9;i++){
            solve(i, n, ans);
        }
        return ans;
    }

    public void solve(int i, int n, List<Integer> ans){
        if(i > n) return;
        ans.add(i);
        for(int j=0;j<=9;j++){
            int next = i*10 + j;
            if(next > n) return;
            solve(next, n, ans);
        }
    }
}