class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int top = 0;
        int right = matrix[0].length -1;
        int bottom = matrix.length -1;
        int left = 0;

        List<Integer> spiral = new ArrayList<>();

        while(top<=bottom && left<=right){
            for(int i = left; i<=right ; i++){
                spiral.add(matrix[top][i]);
            }
            top++;
            if(top>bottom) break;
            
            for(int j = top ; j<=bottom ; j++){
                spiral.add(matrix[j][right]);
            }
            right--;
            if(left>right) break;

            for(int k = right ; k>=left ; k--){
                spiral.add(matrix[bottom][k]);
            }
            bottom--;
            if(top>bottom) break;

            for(int l = bottom ; l>=top ; l--){
                spiral.add(matrix[l][left]);
            }
            left++;
            if(left>right) break;
        }

        return spiral;
    }
}