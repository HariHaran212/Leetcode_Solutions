class Solution {
    private void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    private void reverse(int[] nums, int low, int high){
        while( low < high ){
            swap(nums, low++, high--);
        }
    }

    public void nextPermutation(int[] nums) {
        int breakPoint = -1;
        for(int i = nums.length-1 ; i>0 ; i--){
            if(nums[i-1] < nums[i]){
                breakPoint = i-1;
                break;
            }
        }

        if(breakPoint == -1){
            reverse(nums, 0, nums.length-1);
            return;
        }
        System.out.println(breakPoint);
        int minInd = breakPoint+1;
        for(int i = nums.length-1 ; i>breakPoint ; i--){
            if(nums[breakPoint]<nums[i]){
                swap(nums, breakPoint, i);
                break;
            }
        }
        
        reverse(nums, breakPoint+1, nums.length-1);
    }
}