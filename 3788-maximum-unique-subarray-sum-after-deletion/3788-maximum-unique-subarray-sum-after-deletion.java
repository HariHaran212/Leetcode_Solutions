class Solution {
    public int maxSum(int[] nums) {
        Arrays.sort(nums);

        int prev = nums[nums.length-1];
        int sum = prev;

        for(int i = nums.length-2; i>=0 ; i--){
            if(nums[i]<=0){
                return sum;
            }
            else if(nums[i] == prev){
                continue;
            }
            sum+=nums[i];
            prev = nums[i];
        }
        return sum;
    }
}