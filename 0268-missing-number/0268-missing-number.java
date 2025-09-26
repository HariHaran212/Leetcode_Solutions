class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int prev = 0;
        for(int i = 0 ; i<nums.length ; i++){
            if(nums[i] != prev){
                return prev;
            }
            prev = nums[i]+1;
        }

        return prev;
    }
}