class Solution {
    public List<String> removeAnagrams(String[] words) {
        ArrayList<String> ls = new ArrayList<>();
        String temp = "";
        for(String s : words){
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String current = new String(c);
            if(!current.equals(temp)) ls.add(s);
            temp = current;
        }
        return ls;
    }
}