class Solution {
    private class Result{
        String s;
        int sum;
        public Result(String s, int sum){
            this.s = s;
            this.sum = sum;
        }
    }

    private Result maximumGainAB(String s, int x){
        int sum = 0;
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if(!stack.isEmpty() && stack.peek() == 'a' && c == 'b'){
                stack.pop();
                sum+=x;
            }
            else{
                stack.push(c);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (Character c : stack) {
            sb.append(c);
        }
        return new Result(sb.toString(), sum);
    }
    
    private Result maximumGainBA(String s, int y){
        int sum = 0;
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if(!stack.isEmpty() && stack.peek() == 'b' && c == 'a'){
                stack.pop();
                sum+=y;
            }
            else{
                stack.push(c);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (Character c : stack) {
            sb.append(c);
        }
        return new Result(sb.toString(), sum);
    }
    public int maximumGain(String s, int x, int y) {
        int sum = 0;
        if(x>y){
            Result result = maximumGainAB(s, x);
            sum += result.sum;
            s = result.s;
        }
        else{
            Result result = maximumGainBA(s, y);
            sum += result.sum;
            s = result.s;
        }
        if(x<=y){
            Result result = maximumGainAB(s, x);
            sum += result.sum;
        }
        else{
            Result result = maximumGainBA(s, y);
            sum += result.sum;
        }
        return sum;
    }
}