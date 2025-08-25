class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> ans = new ArrayList<>();
        String[] s = new String[n];
        for(int i=0;i<n;i++){
            s[i] = (i+1)+"";
        }
        Arrays.sort(s);
        for(int i=0;i<n;i++){
            ans.add(Integer.parseInt(s[i]));
        }
        return ans;
    }
}