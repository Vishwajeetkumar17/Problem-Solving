class Solution {
    public ArrayList<Integer> nextGreater(int[] arr) {
        // code here
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> ls = new ArrayList<>(Collections.nCopies(n, -1));

        for(int i=2*n-1;i>=0;i--){
            int idx = i % n;
            while(!st.isEmpty() && arr[st.peek()] <= arr[idx]){
                st.pop();
            }
            if(!st.isEmpty()){
                ls.set(idx, arr[st.peek()]);
            }
            st.push(idx);
        }
        return ls;
    }
}