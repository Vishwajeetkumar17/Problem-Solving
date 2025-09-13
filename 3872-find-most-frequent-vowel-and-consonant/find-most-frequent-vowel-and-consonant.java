class Solution {
    public int maxFreqSum(String s) {
        int[] freq = new int[26];
        int maxV = 0, maxC = 0;
        for(char ch : s.toCharArray()){
            int i = ch - 'a';
            freq[i]++;
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                maxV = Math.max(maxV, freq[i]);
            }
            else{
                maxC = Math.max(maxC, freq[i]);
            }
        }
        return maxC + maxV;
    }
}