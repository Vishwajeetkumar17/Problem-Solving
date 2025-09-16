class Solution {
    public List<Integer> replaceNonCoprimes(int[] nums){
        Stack<Integer> stack = new Stack<>();
        for (int num : nums) {
            int current = num;
            
            while(!stack.isEmpty() && gcd(stack.peek(), current) > 1){
                int top = stack.pop();
                current = lcm(top, current);
            }
            stack.push(current);
        }
        return new ArrayList<>(stack);
    }
    public static int gcd(int a, int b) {
        if(b == 0) return a;
        return gcd(b, a%b); 
    }
    public static int lcm(int a, int b){
        if(a == 0 || b == 0) return 0;
        return (a / gcd(a, b)) * b;
    }
}