class Solution {
  public:
    void sort012(vector<int>& arr) {
        // code here
        int n = arr.size(), s = 0, m = 0, e = n-1;
        while(m <= e){
            if(arr[m] == 0){
                swap(arr[s], arr[m]);
                s++; m++;
            }
            else if(arr[m] == 1){
                m++;
            }
            else{
                swap(arr[m], arr[e]);
                e--;
            }
        }
    }
};