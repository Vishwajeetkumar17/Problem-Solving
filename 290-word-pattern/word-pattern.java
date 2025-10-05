class Solution {
    public boolean wordPattern(String pattern, String s) {
        String str[] = s.split(" ");
        if (pattern.length() != str.length) {
            return false;
        }
        Map<Character, String> mpp = new HashMap<>();
        for(int i = 0; i<pattern.length(); i++){
            char ch = pattern.charAt(i);
            String ss = str[i];
            if(mpp.containsKey(ch)){
                if(!mpp.get(ch).equals(ss)){
                    return false;
                }
            }
            else{
                if(mpp.containsValue(ss)){
                    return false;
                }
                else{
                    mpp.put(ch, ss);
                }
            }
        }
        return true;
    }
}