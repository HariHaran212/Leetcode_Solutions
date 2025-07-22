class Solution {
    public String makeFancyString(String s) {
        if(s.length() <3) return s;
        int n = s.length();

        StringBuilder result = new StringBuilder();
        result.append(s.substring(0,2));

        for(int i = 2 ;i<n ; i++){
            if(s.charAt(i) == s.charAt(i-1) && s.charAt(i) == s.charAt(i-2)){
                continue;
            }
            result.append(s.charAt(i));
        }
        return result.toString();
    }
}