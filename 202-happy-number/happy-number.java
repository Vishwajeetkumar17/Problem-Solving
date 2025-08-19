class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while(n != 1 && !set.contains(n)){
            set.add(n);
            n = happy(n);
        }
        return n == 1;
    }

    public int happy(int n){
        int num = 0;
        while(n>0){
            int rem = n%10;
            num += (rem*rem);
            n /= 10;
        }
        return num;
    }
}