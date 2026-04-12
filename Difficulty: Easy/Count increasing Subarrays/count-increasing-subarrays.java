class Solution {
    public int countIncreasing(int[] arr) {
        // code here
        int count = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length-1;j++){
                if(arr[j] < arr[j+1]){
                    count++;
                }
                else{
                    break;
                }
            }
        }
        return count;
    }
}
