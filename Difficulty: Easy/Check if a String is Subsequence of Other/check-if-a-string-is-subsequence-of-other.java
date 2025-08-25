class Solution {
    public boolean isSubSeq(String s1, String s2) {
        // code here
        if(s1.length() > s2.length()) return false;
        int a = 0;
        int i = 0;
        while(a < s1.length() && i < s2.length()){
            if(s2.charAt(i++) == s1.charAt(a)){
                a++;
                if(a == s1.length()) return true;
            }
        }
        return false;
    }
};