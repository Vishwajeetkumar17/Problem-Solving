class Solution {
    public int minimumChairs(String s) {
        int ans = 0;
        int min = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'E'){
                min++;
                ans = Math.max(min, ans);
            }
            else min--;
        }
        return ans;
    }
}