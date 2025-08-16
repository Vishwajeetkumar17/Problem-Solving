class Solution {
    public int maximum69Number (int num) {
        int change = 1;
        String s = String.valueOf(num);
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(change > 0 && s.charAt(i)=='6'){
                sb.append('9');
                change--;
                continue;
            }
            sb.append(s.charAt(i));
        }
        return Integer.parseInt(sb.toString());
    }
}