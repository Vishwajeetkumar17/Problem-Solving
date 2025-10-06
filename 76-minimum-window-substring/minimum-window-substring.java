class Solution {
    public String minWindow(String s, String t) {
        if(s.length() < t.length()){
            return "";
        }
        Map<Character, Integer> mpp = new HashMap<>();
        for(char ch : t.toCharArray()){
            mpp.put(ch, mpp.getOrDefault(ch, 0) + 1);
        }
        int remain = t.length();
        int[] min = {0, Integer.MAX_VALUE};
        int stIdx = 0;
        for(int endIdx = 0; endIdx < s.length(); endIdx++){
            char ch = s.charAt(endIdx);
            if(mpp.containsKey(ch) && mpp.get(ch) > 0){
                remain--;
            }
            mpp.put(ch, mpp.getOrDefault(ch, 0) - 1);
            if(remain == 0){
                while(true){
                    char st = s.charAt(stIdx);
                    if (mpp.containsKey(st) && mpp.get(st) == 0) {
                        break;
                    }
                    mpp.put(st, mpp.getOrDefault(st, 0) + 1);
                    stIdx++;
                }
                if(endIdx - stIdx < min[1] - min[0]){
                    min[0] = stIdx;
                    min[1] = endIdx;
                }
                mpp.put(s.charAt(stIdx), mpp.getOrDefault(s.charAt(stIdx), 0) + 1);
                remain++;
                stIdx++;
            }
        }
        return min[1] >= s.length() ? "" : s.substring(min[0], min[1] + 1);
    }
}