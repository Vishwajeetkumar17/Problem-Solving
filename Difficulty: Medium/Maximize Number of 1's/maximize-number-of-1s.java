class Solution {
    public int maxOnes(int arr[], int k) {
        // code here
        int cnt = 0;
        int max = 0;
        int i = 0, j = 0;
        while(j < arr.length){
            if(arr[j] == 0){
                cnt++;
            }
            while(cnt > k){
                if(arr[i] == 0){
                    cnt--;
                }
                i++;
            }
            max = Math.max(max, j-i+1);
            j++;
        }
        return max;
    }
}