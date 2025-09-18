// User function Template for Java

class Solution {
    static String isStringExist(String arr[], int N, String S) {
        // code here
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i].length() == S.length()){
                int cnt = 0;
                for(int j=0;j<S.length();j++){
                    if(S.charAt(j) != arr[i].charAt(j)){
                        cnt++;
                    }
                }
                if(cnt == 1) return "True";
            }
        }
        return "False";
    }
}