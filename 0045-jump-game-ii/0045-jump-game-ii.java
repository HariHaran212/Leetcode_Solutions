class Solution {
    public int jump(int[] nums) {
        int curMax = 0;
        int maxIndex = 0;
        int jump = 0;
        int n = nums.length-1;
        for(int i = 0; i<n ; i++){
            maxIndex = Math.max(maxIndex, i+nums[i]);
            if(i == curMax){
                jump++;
                curMax = maxIndex;
                if(curMax >= n){
                    return jump;
                }
            }
        }
        return jump;
    }
}