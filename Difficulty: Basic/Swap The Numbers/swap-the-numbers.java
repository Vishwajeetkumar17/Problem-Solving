class Solution {
    public void swap(int a, int b) {
        // code here
        a = (a + b) - (b = a);

        System.out.println(a + " " + b);
    }
}
