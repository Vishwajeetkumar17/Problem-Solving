class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        int max = 0;
        String ans = "";
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(solve(s, i, j)){
                    if((j-i+1) > max){
                        max = j-i+1;
                        ans = s.substring(i, j+1);
                    }
                }
            }
        }
        return ans;
    }
    public boolean solve(String s, int i, int j){
        if(i>=j) return true;
        if(s.charAt(i) == s.charAt(j)){
            return solve(s, i+1, j-1);
        }
        return false;
    }
}