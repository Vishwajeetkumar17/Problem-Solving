class Solution {
    public String sortVowels(String s) {
        int n = s.length();
        ArrayList<Character> vowel = new ArrayList<>();
        ArrayList<Integer> pos = new ArrayList<>();
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowel.add(ch);
                pos.add(i);
            }
        }
        Collections.sort(vowel);
        char[] ans = s.toCharArray();
        for(int i=0;i<pos.size();i++){
            ans[pos.get(i)] = vowel.get(i);
        }
        return new String(ans);
    }
}