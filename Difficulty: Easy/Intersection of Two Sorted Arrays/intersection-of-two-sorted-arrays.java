class Solution {
    ArrayList<Integer> intersection(int[] a, int[] b) {
        // code here
        ArrayList<Integer> list = new ArrayList<Integer>();
        int lenA = a.length;
        int lenB = b.length;
        int i = 0, j = 0;
        while(i < lenA && j < lenB){
            if(i > 0 && a[i] == a[i-1]){
                i++;
                continue;
            }
            if(j > 0 && b[j] == b[j-1]){
                j++;
                continue;
            }
            if(a[i] == b[j]){
                list.add(a[i]);
                i++;
                j++;
            }
            else if(a[i] < b[j]){
                i++;
            }
            else{
                j++;
            }
        }
        return list;
    }
}