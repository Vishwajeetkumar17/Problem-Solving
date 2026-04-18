class Solution {
    public int mirrorDistance(int n) {
        return Math.abs(n - revNum(n));
    }
    public int revNum(int num){
        int rev = 0;
        while(num > 0){
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        return rev;
    }
}