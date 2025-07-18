class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;

         for(int i : nums){
            sum+=i;
         }
         if(sum%2 == 1) return false;

        int targetSum = sum/2;

        boolean[] dp = new boolean[targetSum+1];
        dp[0] = true;

        for(int num: nums){
            for(int currSum = targetSum ; currSum >= num ; currSum--){
                dp[currSum] = dp[currSum] || dp[currSum-num];
                if(dp[targetSum]) return true;
            }
        }
        
        return dp[targetSum];
    }
}