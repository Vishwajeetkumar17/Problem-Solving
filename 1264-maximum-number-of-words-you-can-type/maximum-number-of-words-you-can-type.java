class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        Set<Character> broken = new HashSet<>();
        int count = 0;

        for(char c : brokenLetters.toCharArray()){
            broken.add(c);
        }

        String[] words = text.split(" ");

        for(String word : words){
            for(char c : word.toCharArray()){
                if(broken.contains(c)){
                    count++;
                    break;
                }
            }
        }
        return words.length - count;
    }
}