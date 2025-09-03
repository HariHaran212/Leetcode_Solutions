class TrieNode{
    TrieNode[] children;
    boolean isEndOfNum;

    public TrieNode(){
        this.children = new TrieNode[10];
    }

    public void insert(int n){
        String num = String.valueOf(n);
        TrieNode curr = this;
        for(char c: num.toCharArray()){
            if(curr.children[c-'0'] == null){
                curr.children[c-'0'] = new TrieNode();
            }
            curr = curr.children[c-'0'];
        }
        curr.isEndOfNum = true;
    }

    private void collectNumbers(TrieNode root, String prefix, List<Integer> result){
        if(root == null) return;

        if(root.isEndOfNum){
            result.add(Integer.parseInt(prefix));
        }

        for(int i = 0 ; i<10 ; i++){
            if(root.children[i] != null){
                collectNumbers(root.children[i], prefix+(char)('0'+i), result);
            }
        }
    }

    public void getAll(List<Integer> result){
        collectNumbers(this, "", result);
    }
}
class Solution {
    public List<Integer> lexicalOrder(int n) {
        TrieNode root = new TrieNode();

        for(int i = 1 ; i<=n ; i++){
            root.insert(i);
        }

        List<Integer> result = new ArrayList<>();
        
        root.getAll(result);
        
        return result;
    }
}