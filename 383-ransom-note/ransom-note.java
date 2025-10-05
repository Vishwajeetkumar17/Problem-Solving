class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length() > magazine.length()) return false;
        Map<Character, Integer> mpp = new HashMap<>();
        for(char ch : magazine.toCharArray()){
            mpp.put(ch, mpp.getOrDefault(ch, 0)+1);
        }
        for(int i=0;i<ransomNote.length();i++){
            char ch = ransomNote.charAt(i);
            if(mpp.containsKey(ch)){
                mpp.put(ch, mpp.get(ch)-1);
                if(mpp.get(ch) == 0) mpp.remove(ch);
            }
            else{
                return false;
            }
        }
        return true;
    }
}