class Solution {
    public int findClosest(int x, int y, int z) {
        int fir = Math.abs(x-z);
        int sec = Math.abs(y-z);
        if(fir > sec) return 2;
        else if(fir < sec) return 1;
        return 0;
    }
}