class Solution {
    int maxOnes(int[] arr) {
        // code here
        int max = 0, zero = 0, one = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 0){
                zero++;
            }
            else{
                zero--;
                one++;
            }
            max = Math.max(zero, max);
            if(zero < 0){
                zero = 0;
            }
        }
        return one + max;
    }
};