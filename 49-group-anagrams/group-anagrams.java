class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> mpp = new HashMap<>();
        for(String str : strs){
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String sorted = new String(arr);
            if(!mpp.containsKey(sorted)){
                mpp.put(sorted, new ArrayList<>());
            }
            mpp.get(sorted).add(str);
        }
        return new ArrayList<>(mpp.values());
    }
}