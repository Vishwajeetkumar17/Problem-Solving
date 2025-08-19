class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        int n = arr.length;
        ArrayList<Integer> ls = new ArrayList<>(Collections.nCopies(n,-1));
        Stack<Integer> st = new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=arr[i]){
                st.pop();
            }
            if(!st.isEmpty()){
                ls.set(i, st.peek());
            }
            st.push(arr[i]);
        }
        return ls;
    }
}