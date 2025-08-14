class Solution {
    public int countSubstrings(String s) {
        int ans = 0;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                if(solve(s, i, j)){
                    ans++;
                }
            }
        }
        return ans;
    }
    public boolean solve(String s, int i, int j){
        if(i>=j) return true;
        if(s.charAt(i) == s.charAt(j)) return solve(s, i+1, j-1);
        return false;
    }
}