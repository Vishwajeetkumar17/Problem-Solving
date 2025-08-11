class Solution {
    int M = (int)1e9 + 7;
    public int[] productQueries(int n, int[][] queries) {
        List<Integer> powers = new ArrayList<>();
        for(int i = 0; i < 32; i++){
            if((n & (1 << i)) != 0){
                powers.add(1 << i);
            }
        }
        int[] res = new int[queries.length];
        for(int q = 0; q < queries.length; q++){
            int st = queries[q][0], e = queries[q][1];
            long prod = 1;
            for(int i = st; i <= e; i++){
                prod = (prod * powers.get(i)) % M;
            }
            res[q] = (int)prod;
        }

        return res;
    }
}