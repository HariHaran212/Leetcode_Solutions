class Solution {
    public int possibleStringCount(String word) {
        int result = 1;
        char prev = '\0';
        
        for(char c : word.toCharArray()){
            if(c == prev){
                result++;
            }
            else{
                prev = c;
            }
        }
        
        return result;
    }
}