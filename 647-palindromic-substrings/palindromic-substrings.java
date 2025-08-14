class Solution {
    public int countSubstrings(String s) {
        int n = s.length();
        int ans = 0;

        for (int i = 0; i < n; i++) {
            ans += expand(s, i, i);
            ans += expand(s, i, i + 1);
        }
        return ans;
    }

    private int expand(String s, int i, int j) {
        int cnt = 0;
        while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
            cnt++;
            j++;
            i--;
        }
        return cnt;
    }
}