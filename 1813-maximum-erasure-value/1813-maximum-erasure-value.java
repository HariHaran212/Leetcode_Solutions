class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int result = 0;
        Set<Integer> set = new HashSet<>();
        
        int l = 0;
        int sum = 0;

        for(int i = 0 ; i<nums.length ; i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
                sum+=nums[i];
            }
            else{
                while(nums[l]!=nums[i] && l<nums.length){
                    sum-=nums[l];
                    set.remove(nums[l]);
                    l++;
                }
                l++;
            }
            
            if(sum>result){
                result = sum;
            }
        }
        return result;
        
    }
}