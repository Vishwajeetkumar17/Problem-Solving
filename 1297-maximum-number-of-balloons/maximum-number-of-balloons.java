class Solution {
    public int maxNumberOfBalloons(String text) {
        Map<Character, Integer> mpp = new HashMap<>();
        int min = Integer.MAX_VALUE;
        mpp.put('b', 0);
        mpp.put('a', 0);
        mpp.put('l', 0);
        mpp.put('o', 0);
        mpp.put('n', 0);
        for(int i=0;i<text.length();i++){
            char ch = text.charAt(i);
            if(ch == 'b' || ch == 'a' || ch == 'l' || ch == 'o' || ch == 'n'){
                mpp.put(ch, mpp.getOrDefault(ch, 0)+1);
            }
        }
        for(Map.Entry<Character, Integer> mp : mpp.entrySet()){
            int temp = 0;
            if(mp.getKey() == 'b'){
                temp = mp.getValue();
            }
            else if(mp.getKey() == 'a'){
                temp = mp.getValue();
            }
            else if(mp.getKey() == 'l'){
                temp = mp.getValue()/2;
            }
            else if(mp.getKey() == 'o'){
                temp = mp.getValue()/2;
            }
            else if(mp.getKey() == 'n'){
                temp = mp.getValue();
            }
            min = Math.min(min, temp);
        }
        return min;
    }
}