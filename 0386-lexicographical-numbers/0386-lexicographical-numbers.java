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

    private List<Integer> collectNumbers(TrieNode root, String prefix, List<Integer> result){
        if(root == null) return result;

        if(root.isEndOfNum){
            int num = Integer.parseInt(prefix);
            result.add(num);
        }

        for(int i = 0 ; i<10 ; i++){
            if(root.children[i] != null){
                result = collectNumbers(root.children[i], prefix+(char)('0'+i), result);
            }
        }

        return result;
    }

    public List<Integer>  getAll(List<Integer> result){
        return collectNumbers(this, "", result);
    }
}
class Solution {
    public List<Integer> lexicalOrder(int n) {
        TrieNode root = new TrieNode();

        for(int i = 1 ; i<=n ; i++){
            root.insert(i);
        }

        List<Integer> result = root.getAll(new ArrayList<>());
        
        return result;
    }
}