class Solution {
    boolean canFormPalindrome(String s) {
        // code here
        Map<Character, Integer> mpp = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            mpp.put(ch, mpp.getOrDefault(ch, 0) + 1);
        }
        int oddCount = 0;
        for(int cnt : mpp.values()){
            if(cnt % 2 != 0) {
                oddCount++;
            }
        }
        if(oddCount > 1) {
            return false;
        }
        return true;
    }
}