class Solution {
    private void searchFirst(int[] nums, int target, int low, int high, int[] result){
        while(low<=high){
            int mid = low + (high-low)/2;

            if(nums[mid] == target){
                result[0] = mid;
                high = mid-1;
            }
            else if( nums[mid] > target ){
                high = mid-1;
            }
            else {
                low = mid+1;
            }
        }
    }

    private void searchLast(int[] nums, int target, int low, int high, int[] result){
        while(low<=high){
            int mid = low + (high-low)/2;

            if(nums[mid] == target){
                result[1] = mid;
                low = mid+1;
            }
            else if( nums[mid] > target ){
                high = mid-1;
            }
            else {
                low = mid+1;
            }
        }
    }


    private void searchRange(int[] nums, int target, int low, int high, int[] result){

        while(low<=high){
            int mid = low + (high-low)/2;

            if(nums[mid] == target){
                result[0] = result[1] = mid;
                searchFirst(nums, target, low, mid-1, result);
                searchLast(nums, target, mid+1, high, result);
                return;
            }
            else if( nums[mid] > target ){
                high = mid-1;
            }
            else {
                low = mid+1;
            }
        }

    }
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[]{-1, -1};
        searchRange(nums, target, 0, nums.length-1, result);
        return result;
    }
}