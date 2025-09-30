class Solution {
    public ArrayList<String> binstr(int n) {
        // code here
        ArrayList<String> ans = new ArrayList<>();
        solve(n,"", ans);
        return ans;
    }
    public static void solve(int n, String temp, List<String> ans){
        if(temp.length() == n){
            ans.add(temp);
            return;
        }
        solve(n,temp+'0', ans);
        solve(n, temp+'1', ans);
    }
}
