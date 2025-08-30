class Solution {
    public static String smallestWindow(String s, String p) {
        // code here
        if (s.length() < p.length()) return "";

        int[] freqP = new int[26];
        int[] freqS = new int[26];

        for(char c : p.toCharArray()){
            freqP[c - 'a']++;
        }

        int req = p.length(); 
        int l = 0, min = Integer.MAX_VALUE, st = -1;
        int cnt = 0;

        for(int r = 0; r < s.length(); r++){
            char c = s.charAt(r);
            freqS[c - 'a']++;

            if(freqS[c - 'a'] <= freqP[c - 'a']){
                cnt++;
            }

            while(cnt == req){
                if (r - l + 1 < min) {
                    min = r - l + 1;
                    st = l;
                }

                char leftChar = s.charAt(l);
                freqS[leftChar - 'a']--;
                if(freqS[leftChar - 'a'] < freqP[leftChar - 'a']){
                    cnt--;
                }
                l++;
            }
        }

        return st == -1 ? "" : s.substring(st, st + min);
    }
}