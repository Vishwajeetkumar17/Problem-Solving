// User function Template for Java
class Solution {
    static int distinct(int arr[]) {
        // code here
        Set<Integer> set = new HashSet<>();
        for(int ar : arr){
            if(set.contains(ar)){
                continue;
            }
            set.add(ar);
        }
        return set.size();
    }
}