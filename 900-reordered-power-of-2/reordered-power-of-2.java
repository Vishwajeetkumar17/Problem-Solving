class Solution {
    public static boolean permutation(char arr[], int i, int j) {
        if (i == j) {
            String s = new String(arr);
            if (s.charAt(0) != '0') {
                int number = Integer.parseInt(s);
                return (number > 0 && (number & (number - 1)) == 0);
            }
            return false;
        }

        for (int k = i; k <= j; k++) {
            swap(arr, i, k);
            if (permutation(arr, i + 1, j)) return true; 
            swap(arr, i, k);
        }
        return false;
    }

    public static void swap(char arr[], int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public boolean reorderedPowerOf2(int n) {
        String s = String.valueOf(n);
        char arr[] = s.toCharArray();
        return permutation(arr, 0, arr.length - 1);
    }
}