class Solution {
    public int totalMoney(int n) {
        int val = 0;   
        int prev = 1; 
        int week = 0;  
        for(int i = 1; i <= n; i++){
            val += prev; 
            prev++;      
            if(i % 7 == 0){
                week++;
                prev = 1 + week; 
            }
        }
        return val;
    }
}