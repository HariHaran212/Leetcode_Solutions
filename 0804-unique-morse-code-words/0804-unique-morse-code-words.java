class Solution {
    private String toMorse(String[] str, String word){
        StringBuilder sb = new StringBuilder();

        for(char ch : word.toCharArray()){
            sb.append(str[ch-'a']);
        }

        return sb.toString();
    }
    public int uniqueMorseRepresentations(String[] words) {
        String[] str = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        Set<String> set = new HashSet<>();

        for(String s : words){
            set.add(toMorse(str, s));
        }

        return set.size();
    }
}