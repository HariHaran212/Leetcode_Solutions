class Solution {
    public int maxSum(int[] nums) {
        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        Arrays.sort(nums);

        if(nums[n-1]<=0){
            return nums[n-1];
        }

        int i = 0;
        for(; i<nums.length && nums[i]<=0 ; i++);

        int sum = 0;

        for( ; i<nums.length ; i++){
            if(set.contains(nums[i])){
                continue;
            }
            set.add(nums[i]);
            sum+=nums[i];
        }
        return sum;
    }
}