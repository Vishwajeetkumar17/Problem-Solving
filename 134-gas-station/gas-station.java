class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int total = 0;
        int need = 0;
        int st = 0;
        for(int i=0;i<n;i++){
            total += gas[i] - cost[i];
            need += gas[i] - cost[i];
            if(need < 0){
                need = 0;
                st = i + 1; 
            }
        }
        return (total < 0) ? -1 : st;
    }
}