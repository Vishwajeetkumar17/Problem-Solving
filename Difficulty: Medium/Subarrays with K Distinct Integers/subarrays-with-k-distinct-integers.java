// User function Template for Java

class Solution {
    static int exactlyK(int arr[], int k) {
        // code here
        return atMostK(arr, k) - atMostK(arr, k - 1);
    }

    static int atMostK(int arr[], int k){
        int ans = 0;
        Map<Integer,Integer> mpp = new HashMap<>();
        int i = 0;
        for(int j = 0; j<arr.length; j++){
            mpp.put(arr[j], mpp.getOrDefault(arr[j], 0) + 1);
            if(mpp.get(arr[j]) == 1){
                k--;
            }
            while(k < 0){
                mpp.put(arr[i], mpp.get(arr[i])-1);
                if(mpp.get(arr[i]) == 0){
                    mpp.remove(arr[i]);
                    k++;
                }
                i++;
            }
            ans += (j - i + 1);
        }
        return ans;
    }
}
