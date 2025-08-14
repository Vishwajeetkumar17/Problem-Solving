class Solution {
    public boolean isPalindrome(int x) {
        int p = x;
        int ans = 0;
        while(x>0){
            int rem = x%10;
            ans = ans*10+rem;
            x /= 10;
        }
        if(ans == p) return true;
        return false;
    }
}