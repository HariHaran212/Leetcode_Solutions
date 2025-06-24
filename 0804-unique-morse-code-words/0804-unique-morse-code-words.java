class Solution {
    private String toMorse(Map<Character, String> map, String word){
        StringBuilder sb = new StringBuilder();

        for(char ch : word.toCharArray()){
            sb.append(map.get(ch));
        }

        return sb.toString();
    }
    public int uniqueMorseRepresentations(String[] words) {
        Map<Character, String> map = new HashMap<>();
        String[] str = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        for(int i = 0 ; i<26 ; i++){
            map.put((char)('a'+i), str[i]);
        }

        Set<String> set = new HashSet<>();

        for(int i = 0 ; i<words.length ; i++){
            String s = toMorse(map, words[i]);
            set.add(s);
        }

        return set.size();
    }
}