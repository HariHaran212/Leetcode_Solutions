class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int num : nums){
            currSum = num < currSum+num ? currSum += num : num;
            if(currSum > maxSum){
                maxSum = currSum;
            }
        }
        return maxSum;
    }
}