class Solution {
    boolean areKAnagrams(String s1, String s2, int k) {
        // code here
        if(s1.length() != s2.length()) return false;
        Map<Character, Integer> mpp = new HashMap<>();
        for(char c : s1.toCharArray()){
            mpp.put(c, mpp.getOrDefault(c, 0)+1);
        }
        int cnt = 0;
        for(char c : s2.toCharArray()){
            if(mpp.containsKey(c)){
                mpp.put(c, mpp.get(c)-1);
                if(mpp.get(c) == 0){
                    mpp.remove(c);
                }
            }
            else{
                cnt++;
            }
        }
        return cnt<=k;
    }
}