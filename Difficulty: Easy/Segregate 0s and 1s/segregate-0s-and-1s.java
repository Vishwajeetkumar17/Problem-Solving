class Solution {
    void segregate0and1(int[] arr) {
        // code here
        int cnt1  = 0, cnt2 = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 0){
                cnt1++;
            }
            if(arr[i] == 1){
                cnt2++;
            }
        }
        int i = 0;
        while(cnt1 > 0 && i < arr.length){
            arr[i++] = 0;
            cnt1--;
        }
        while(cnt2 > 0 && i < arr.length){
            arr[i++] = 1;
            cnt2--;
        }
    }
}
