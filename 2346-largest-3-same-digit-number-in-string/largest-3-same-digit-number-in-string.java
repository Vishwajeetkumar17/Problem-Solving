class Solution {
    public String largestGoodInteger(String num) {
        String max = "";
        for(int i = 0; i < num.length() - 2; i++){
            String sb = num.substring(i, i + 3);
            if(sb.charAt(0) == sb.charAt(1) && sb.charAt(1) == sb.charAt(2)){
                if(max.isEmpty() || ismax(sb, max)){
                    max = sb;
                }
            }
        }
        return max;
    }

    public static boolean ismax(String sb, String max) {
        int a = Integer.valueOf(sb);
        int b = Integer.valueOf(max);
        return a > b;
    }
}