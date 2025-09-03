class Solution {
    private void order(int n, int i, List<Integer> result){
        if(i>n) return ;

        if(i != 0) result.add(i);

        for(int ind = (i == 0) ? 1 : 0 ; ind<10 ; ind++){
            if(i*10+ind>n) return;
            order(n, i*10+ind, result);
        }
    }

    public List<Integer> lexicalOrder(int n) {
        List<Integer> result = new ArrayList<>();

        order(n, 0, result);

        return result;
    }
}